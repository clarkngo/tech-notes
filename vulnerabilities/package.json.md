
# hoek
```
Remediation
Upgrade hoek to version 4.2.1 or later. For example:

"dependencies": {
  "hoek": ">=4.2.1"
}
or…
"devDependencies": {
  "hoek": ">=4.2.1"
}
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2018-3728 More information
moderate severity
Vulnerable versions: < 4.2.1
Patched version: 4.2.1
hoek node module before 5.0.3 or 4.2.1 suffers from a Modification of Assumed-Immutable Data (MAID) vulnerability via 'merge' and 'applyToDefaults' functions, which allows a malicious user to modify the prototype of "Object" via proto, causing the addition or modification of an existing property that will exist on all objects.
```

# static_eval
```
Remediation
Upgrade static-eval to version 2.0.0 or later. For example:

"dependencies": {
  "static-eval": ">=2.0.0"
}
or…
"devDependencies": {
  "static-eval": ">=2.0.0"
}
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2017-16226 More information
moderate severity
Vulnerable versions: < 2.0.0
Patched version: 2.0.0
The static-eval module is intended to evaluate statically-analyzable expressions. In affected versions, untrusted user input is able to access the global function constructor, effectively allowing arbitrary code execution.
```

# cryptiles
```
Remediation
Upgrade cryptiles to version 4.1.2 or later. For example:

"dependencies": {
  "cryptiles": ">=4.1.2"
}
or…
"devDependencies": {
  "cryptiles": ">=4.1.2"
}
Always verify the validity and compatibility of suggestions with your codebase.

Details
CVE-2018-1000620 More information
high severity
Vulnerable versions: < 4.1.2
Patched version: 4.1.2
The NPM package cryptiles version 4.1.1 and earlier contains a CWE-331: Insufficient Entropy vulnerability in randomDigits() method that can result in An attacker is more likely to be able to brute force something that was supposed to be random.. This attack appear to be exploitable via Depends upon the calling application.. This vulnerability appears to have been fixed in 4.1.2.
```

# sync-exec
Remediation
No patched version is available.

Details
CVE-2017-16024 More information
moderate severity
Vulnerable versions: <= 0.6.2
Patched version: No fix
Affected versions of sync-exec use files located in /tmp/ to buffer command results before returning values. As /tmp/ is almost always set with world readable permissions, this may allow low privilege users on the system to read the results of commands run via sync-exec under a higher privilege user.

There is currently no direct patch for sync-exec, as the child_process.execSync function provided in Node.js v0.12.0 and later provides the same functionality natively.

The best mitigation currently is to update to Node.js v0.12.0 or later, and migrate all uses of sync-exec to child_process.execSync().
