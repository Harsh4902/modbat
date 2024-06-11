package modbat.config

class Version(pkg: String) {
  println(pkg)
  val packageHandle = getClass().getClassLoader().getDefinedPackage(pkg)
  println(packageHandle)
  assert (packageHandle != null,
	  { "Cannot find package; available packages: " +
	    Package.getPackages.mkString("\n") })
  override def toString() = packageHandle.getSpecificationVersion +
    " rev " + packageHandle.getImplementationVersion
}
