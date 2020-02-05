/Library/Java/JavaVirtualMachines/jdk-13.0.2.jdk/Contents/Home/bin/jdeps --module-path build/classes/java/main  -s --module modu



/Library/Java/JavaVirtualMachines/jdk-13.0.2.jdk/Contents/Home/bin/jlink –-module-path /Library/Java/JavaVirtualMachines/jdk-13.0.2.jdk/Contents/Home/jmods --add-modules modu --output customjre


/Library/Java/JavaVirtualMachines/jdk-13.0.2.jdk/Contents/Home/bin/jlink --launcher customjrelauncher=modu/modu.Main --module-path build/classes/java/main --add-modules modu --output customjre2
/Library/Java/JavaVirtualMachines/jdk-13.0.2.jdk/Contents/Home/bin/jlink --launcher customjrelauncher=modu/modu.Main --module-path build/classes/java/main --add-modules modu --output customjre3 --strip-debug
/Library/Java/JavaVirtualMachines/jdk-13.0.2.jdk/Contents/Home/bin/jlink --launcher customjrelauncher=modu/modu.Main --module-path build/classes/java/main --add-modules modu --output customjre5 --strip-debug --vm=server
/Library/Java/JavaVirtualMachines/jdk-13.0.2.jdk/Contents/Home/bin/jlink --launcher customjrelauncher=modu/modu.Main --module-path build/classes/java/main --add-modules modu --output customjre6 --strip-debug --vm=server --compress=2

/Library/Java/JavaVirtualMachines/jdk-13.0.2.jdk/Contents/Home/bin/jlink \
--launcher customjrelauncher=modu/modu.Main \
--module-path build/classes/java/main \
--add-modules modu --output customjre7 \
--strip-debug --vm=server --strip-java-debug-attributes
