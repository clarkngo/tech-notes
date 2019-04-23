# tasks.json
## shows version of ASP<span>.NET Core

```
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "build",
            "command": "dotnet",
            "type": "process",
            "args": [
                "build",
                "${workspaceFolder}/DoublePay/DoublePay.csproj"
            ],
            "problemMatcher": "$msCompile"
        }
    ]
}
```
## More info on [Tasks](https://code.visualstudio.com/docs/editor/tasks-v1)

# `label`
- The task's label used in the user interface.
# `command`
- The actual command to execute.
# `type`
- If `process` is specified, the command is interpreted as a process to execute.

## More info on [label, command, etc.](https://code.visualstudio.com/docs/editor/tasks)

# `dotnet build`
- builds the project and its dependencies into a set of binaries.
- binaries include the project's code in the Intermediate Language (IL) files with a *.dll* extension and symbol files used for debugging with a *.pdb* extension.

## More info on [dotnet build](https://docs.microsoft.com/en-us/dotnet/core/tools/dotnet-build?tabs=netcore2x)

# `problemMatcher`
- Processing Task Output with Problem Matchers
- Scans the task output text for known warning or error strings and report these inline in the editor in the Problems panel. Problem matchers can be set globally or in a specific task entry. You can also create your own problem matcher.
- ## `$mscompile`
  - for **CSharp and VB Compiler**
  - assumes that file names are reported as an absolute path
