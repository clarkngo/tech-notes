# Testing with user input

Source: https://stackoverflow.com/questions/44471683/getting-input-in-advance-in-junit-test
```
public class ReaderTest {

    @Test
    public void test() throws IOException {
        String example = "some input line"; //the line we will try to read
        InputStream stream = new ByteArrayInputStream((example+"\n").getBytes(StandardCharsets.UTF_8)); //this stream will output the example string
        InputStream stdin = System.in; //save the standard in to restore it later
        System.setIn(stream); //set the standard in to the mocked stream
        assertEquals(example, Reader.readLine()); //check if the method works
        System.setIn(stdin);//restore the stardard in
    }

}

class Reader{
    public static String readLine() throws IOException{
       BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
       return stdin.readLine();
    }
}
```