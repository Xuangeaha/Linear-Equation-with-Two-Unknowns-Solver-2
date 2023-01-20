import jpype

jvmPath = jpype.getDefaultJVMPath()
jpype.startJVM(jvmPath)

jpype.java.lang.System.out.println("123")