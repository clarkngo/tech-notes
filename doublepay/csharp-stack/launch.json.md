# launch.json
```
{
   // Use IntelliSense to find out which attributes exist for C# debugging
   // Use hover for the description of the existing attributes
   // For further information visit https://github.com/OmniSharp/omnisharp-vscode/blob/master/debugger-launchjson.md
   "version": "0.2.0",
   "configurations": [
        {
            "name": ".NET Core Launch (web)",
            "type": "coreclr",
            "request": "launch",
            "preLaunchTask": "build",
            // If you have changed target frameworks, make sure to update the program path.
            "program": "${workspaceFolder}/DoublePay/bin/Debug/netcoreapp2.0/DoublePay.dll",
            "args": [],
            "cwd": "${workspaceFolder}/DoublePay",
            "stopAtEntry": false,
            "internalConsoleOptions": "openOnSessionStart",
            "launchBrowser": {
                "enabled": true,
                "args": "${auto-detect-url}",
                "windows": {
                    "command": "cmd.exe",
                    "args": "/C start ${auto-detect-url}"
                },
                "osx": {
                    "command": "open"
                },
                "linux": {
                    "command": "xdg-open"
                }
            },
            "env": {
                "ASPNETCORE_ENVIRONMENT": "Development"
            },
            "sourceFileMap": {
                "/Views": "${workspaceFolder}/Views"
            }
        },
        {
            "name": ".NET Core Attach",
            "type": "coreclr",
            "request": "attach",
            "processId": "${command:pickProcess}"
        }
    ,]
}
```

# `program`
- path of the application dll or .NET Core host executable to launch.
# `cwd`
- working directory of the target process.
# `args`
- arguments passed to your program.
# `stopAtEntry`
- if need to stop entry point of the target.
# `launchBrowser`
- launch web browser and auto generate launch file if there are web server dependencies in project.json.
# `env`
- environment variables passed to your program.
# `sourceFileMap`
- configure a file by file mapping.

