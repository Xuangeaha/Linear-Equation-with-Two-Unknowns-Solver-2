import jpype

jpype.startJVM(jpype.getDefaultJVMPath())

Solver = jpype.JClass("Solver")
Solver.solveIO()