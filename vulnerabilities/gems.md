# bootstrap
```
Remediation
Upgrade bootstrap to version 4.3.1 or later. For example:

gem "bootstrap", ">= 4.3.1"
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2018-14042 More information
moderate severity
Vulnerable versions: < 4.1.2
Patched version: 4.1.2
In Bootstrap before 4.1.2, XSS is possible in the data-container property of tooltip. This is similar to CVE-2018-14041.

CVE-2019-8331 More information
moderate severity
Vulnerable versions: < 4.3.1
Patched version: 4.3.1
In Bootstrap 4 before 4.3.1 and Bootstrap 3 before 3.4.1, XSS is possible in the tooltip or popover data-template attribute. For more information, see: https://blog.getbootstrap.com/2019/02/13/bootstrap-4-3-1-and-3-4-1/
```

# nokogiri
```
Remediation
Upgrade nokogiri to version 1.8.5 or later. For example:

gem "nokogiri", ">= 1.8.5"
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2018-14404 More information
moderate severity
Vulnerable versions: < 1.8.5
Patched version: 1.8.5
A NULL pointer dereference vulnerability exists in the xpath.c:xmlXPathCompOpEval() function of libxml2 through 2.9.8 when parsing an invalid XPath expression in the XPATH_OP_AND or XPATH_OP_OR case. Applications processing untrusted XSL format inputs with the use of the libxml2 library may be vulnerable to a denial of service attack due to a crash of the application.
```
# rack
```
Remediation
Upgrade rack to version 2.0.6 or later. For example:

gem "rack", ">= 2.0.6"
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2018-16471 More information
moderate severity
Vulnerable versions: >= 2.0.0, < 2.0.6
Patched version: 2.0.6
There is a possible XSS vulnerability in Rack before 2.0.6 and 1.6.11. Carefully crafted requests can impact the data returned by the scheme method on Rack::Request. Applications that expect the scheme to be limited to 'http' or 'https' and do not escape the return value could be vulnerable to an XSS attack. Note that applications using the normal escaping mechanisms provided by Rails may not impacted, but applications that bypass the escaping mechanisms, or do not use them may be vulnerable.

CVE-2018-16470 More information
moderate severity
Vulnerable versions: >= 2.0.4, < 2.0.6
Patched version: 2.0.6
There is a possible DoS vulnerability in the multipart parser in Rack before 2.0.6. Specially crafted requests can cause the multipart parser to enter a pathological state, causing the parser to use CPU resources disproportionate to the request size.
```
# loofah
```
Remediation
Upgrade loofah to version 2.2.3 or later. For example:

gem "loofah", ">= 2.2.3"
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2018-16468 More information
moderate severity
Vulnerable versions: < 2.2.3
Patched version: 2.2.3
In the Loofah gem for Ruby, through version 2.2.2, unsanitized JavaScript may occur in sanitized output when a crafted SVG element is republished. Users are advised to upgrade to version 2.2.3.

See flavorjones/loofah#154 for more details.
```

# sprockets
```
Remediation
Upgrade sprockets to version 3.7.2 or later. For example:

gem "sprockets", ">= 3.7.2"
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2018-3760 More information
high severity
Vulnerable versions: >= 3.0.0, < 3.7.2
Patched version: 3.7.2
Specially crafted requests can be used to access files that exist on the filesystem that is outside an application's root directory, when the Sprockets server is used in production.

All users running an affected release should either upgrade or use one of the work arounds immediately.

Workaround:

In Rails applications, work around this issue, set config.assets.compile = false and config.public_file_server.enabled = true in an initializer and precompile the assets.

This work around will not be possible in all hosting environments and upgrading is advised.
```

# actionview
```
Remediation
Upgrade actionview to version 5.2.2.1 or later. For example:

gem "actionview", ">= 5.2.2.1"
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2019-5418 More information
critical severity
Vulnerable versions: >= 5.2.0, < 5.2.2.1
Patched version: 5.2.2.1
File Content Disclosure in Action View
Impact
There is a possible file content disclosure vulnerability in Action View.
Specially crafted accept headers in combination with calls to render file:
can cause arbitrary files on the target server to be rendered, disclosing the
file contents.

The impact is limited to calls to render which render file contents without
a specified accept format. Impacted code in a controller looks something like
this:

class UserController < ApplicationController 
  def index 
    render file: "#{Rails.root}/some/file" 
  end 
end 
Rendering templates as opposed to files is not impacted by this vulnerability.

All users running an affected release should either upgrade or use one of the
workarounds immediately.

Releases
The 6.0.0.beta3, 5.2.2.1, 5.1.6.2, 5.0.7.2, and 4.2.11.1 releases are
available at the normal locations.

Workarounds
This vulnerability can be mitigated by specifying a format for file rendering,
like this:

class UserController < ApplicationController 
  def index 
    render file: "#{Rails.root}/some/file", formats: [:html] 
  end 
end 
In summary, impacted calls to render look like this:

render file: "#{Rails.root}/some/file" 
The vulnerability can be mitigated by changing to this:

render file: "#{Rails.root}/some/file", formats: [:html] 
Other calls to render are not impacted.

Alternatively, the following monkey patch can be applied in an initializer:

$ cat config/initializers/formats_filter.rb 
# frozen_string_literal: true 

ActionDispatch::Request.prepend(Module.new do 
  def formats 
    super().select do |format| 
      format.symbol || format.ref == "*/*" 
    end 
  end 
end) 
Credits
Thanks to John Hawthorn john@hawthorn.email of GitHub

CVE-2019-5419 More information
critical severity
Vulnerable versions: >= 5.2.0, < 5.2.2.1
Patched version: 5.2.2.1
Denial of Service Vulnerability in Action View
Impact
Specially crafted accept headers can cause the Action View template location
code to consume 100% CPU, causing the server unable to process requests. This
impacts all Rails applications that render views.

All users running an affected release should either upgrade or use one of the
workarounds immediately.

Releases
The 6.0.0.beta3, 5.2.2.1, 5.1.6.2, 5.0.7.2, and 4.2.11.1 releases are
available at the normal locations.

Workarounds
This vulnerability can be mitigated by wrapping render calls with
respond_to blocks. For example, the following example is vulnerable:

class UserController < ApplicationController 
  def index 
    render "index" 
  end 
end 
But the following code is not vulnerable:

class UserController < ApplicationController 
  def index 
    respond_to |format| 
      format.html { render "index" } 
    end 
  end 
end 
Implicit rendering is impacted, so this code is vulnerable:

class UserController < ApplicationController 
  def index 
  end 
end 
But can be changed this this:

class UserController < ApplicationController 
  def index 
    respond_to |format| 
      format.html { render "index" } 
    end 
  end 
end 
Alternatively to specifying the format, the following monkey patch can be
applied in an initializer:

$ cat config/initializers/formats_filter.rb 
# frozen_string_literal: true 

ActionDispatch::Request.prepend(Module.new do 
  def formats 
    super().select do |format| 
      format.symbol || format.ref == "*/*" 
    end 
  end 
end) 
Please note that only the 5.2.x, 5.1.x, 5.0.x, and 4.2.x series are supported
at present. Users of earlier unsupported releases are advised to upgrade as
soon as possible as we cannot guarantee the continued availability of security
fixes for unsupported releases.

Also note that the patches for this vulnerability are the same as CVE-2019-5418.

Credits
Thanks to John Hawthorn john@hawthorn.email of GitHub
```

# railties
```
Remediation
Upgrade railties to version 5.2.2.1 or later. For example:

gem "railties", ">= 5.2.2.1"
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2019-5420 More information
moderate severity
Vulnerable versions: >= 5.2.0, < 5.2.2.1
Patched version: 5.2.2.1
Possible Remote Code Execution Exploit in Rails Development Mode
Impact
With some knowledge of a target application it is possible for an attacker to
guess the automatically generated development mode secret token. This secret
token can be used in combination with other Rails internals to escalate to a
remote code execution exploit.

All users running an affected release should either upgrade or use one of the
workarounds immediately.

Releases
The 6.0.0.beta3 and 5.2.2.1 releases are available at the normal locations.

Workarounds
This issue can be mitigated by specifying a secret key in development mode.
In "config/environments/development.rb" add this:

  config.secret_key_base = SecureRandom.hex(64) 
Please note that only the 5.2.x, 5.1.x, 5.0.x, and 4.2.x series are supported
at present. Users of earlier unsupported releases are advised to upgrade as
soon as possible as we cannot guarantee the continued availability of security
fixes for unsupported releases.

Credits
Thanks to ooooooo_q
```

# devise
```
Remediation
Upgrade devise to version 4.6.0 or later. For example:

gem "devise", ">= 4.6.0"
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2019-5421 More information
moderate severity
Vulnerable versions: < 4.6.0
Patched version: 4.6.0
Devise ruby gem before 4.6.0 when the lockable module is used is vulnerable to a time-of-check time-of-use (TOCTOU) race condition due to increment_failed_attempts within the Devise::Models::Lockable class not being concurrency safe.
```
