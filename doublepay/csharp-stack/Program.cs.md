# C# files
## Progam.cs
- Entry point of C# program.
- Starts with static method called `Main`.
- Calls `BuldWebHost` method.

### Namespace
- #### System Namespace
  - Contains fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions.
  - ##### [Object Class](https://docs.microsoft.com/en-us/dotnet/api/system.object?view=netframework-4.7.2)
    - Namespace: System
    - Assemblies: System.Runtime.dll, mscorlib.dll, netstandard.dll
    - Supports all classes in the .NET Framework class hierarchy and provides low-level services to derived classes. This is the ultimate base class of all classes in the .NET Framework; it is the root of the type hierarchy.
  - ##### [String Class](https://docs.microsoft.com/en-us/dotnet/api/system.string?view=netframework-4.7.2)
    - Namespace: System
    - Assemblies: System.Runtime.dll, mscorlib.dll, netstandard.dll
    - Inheritance: Object -> String
    - Attributes: ComVisibleAttribute, SerializableAttribute
    - Implements: IEnumerable<Char>, IEnumerable, ICloneable, IComparable, IComparable<String>, IConvertible, IEquatable<String>

### Code Snippets

#### `public static void Main(string[] args)`
- The parameter of the Main method is a String array that represents the command-line arguments
  - Examples:
      - `MyApp.exe Arg1 Arg2 Arg3`
        - passes an array of strings `"Arg1"`, `"Arg2"`, `"Arg3"`.
      - `MyApp.exe "Arg 1" "Arg 2" "Arg 3"`
        - enclose in quotes if with spaces
      - `Copy.exe C:\file1.txt C:\file2.txt`
        - locations as arguments
  - Sources: 
    - [Stackoverflow](https://stackoverflow.com/questions/552796/what-is-string-args-in-main-class-for)
    - [C# programming guide on MSDN](https://docs.microsoft.com/en-us/dotnet/csharp/programming-guide/main-and-command-args/command-line-arguments)

#### `IWebHost`

####  `Program.cs`:
ASP<span>.NET Core 2.0 template

Sources:
- [Migrate from ASP.NET Core 2.0 to 2.1](https://docs.microsoft.com/en-us/aspnet/core/migration/20_21?view=aspnetcore-2.2
)

-  [Migrate from ASP.NET Core 1.x to 2.0](https://docs.microsoft.com/en-us/aspnet/core/migration/1x-to-2x/?view=aspnetcore-2.2)

```
using Microsoft.AspNetCore;
using Microsoft.AspNetCore.Hosting;
### more code ###
    {
        public static void Main(string[] args)
        {
            BuildWebHost(args).Run();
        }

        public static IWebHost BuildWebHost(string[] args) =>
            WebHost.CreateDefaultBuilder(args)
                .UseStartup<Startup>()
                .Build();
    }
### more code ###
```


## Full Code - `Program.cs`:
```
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;

namespace DoublePay
{
    public class Program
    {
        public static void Main(string[] args)
        {
            BuildWebHost(args).Run();
        }

        public static IWebHost BuildWebHost(string[] args) =>
            WebHost.CreateDefaultBuilder(args)
                .UseStartup<Startup>()
                .Build();
    }
}
```

## Startup.cs
- Main configuration file of your class.
- Where we add features and services to our server.

```
namespace DoublePay
{
    public class Startup
    {
        public Startup(IConfiguration configuration)
        {
            Configuration = configuration;
        }

        public IConfiguration Configuration { get; }

        // This method gets called by the runtime. Use this method to add services to the container.
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddMvc();
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IHostingEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
                app.UseWebpackDevMiddleware(new WebpackDevMiddlewareOptions
                {
                    HotModuleReplacement = true
                });
            }
            else
            {
                app.UseExceptionHandler("/Home/Error");
            }

            app.UseStaticFiles();

            app.UseMvc(routes =>
            {
                routes.MapRoute(
                    name: "default",
                    template: "{controller=Home}/{action=Index}/{id?}");

                routes.MapSpaFallbackRoute(
                    name: "spa-fallback",
                    defaults: new { controller = "Home", action = "Index" });
            });
        }
    }
}

```