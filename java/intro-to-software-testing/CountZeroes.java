/**
 * Counts zeroes in an array
 * @param x array of occurences of 0 in x
 * @return number of occurences of 0 in x
 * @throws NullPointerException if x is null
 */
public static int numZero(int[] x)
{
  int count = 0;
  for (int i = 1; i < x.length; i++)
  {
    if (x[i] == 0) count++;
  }
  return count;
}
