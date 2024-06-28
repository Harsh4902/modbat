package modbat.config

class Version(pkg: Package) {
  assert(pkg != null,
    {
      "Cannot find package; available packages: " + Package.getPackages.mkString("\n")
    })

  override def toString(): String = {
    pkg.getSpecificationVersion + " rev " + pkg.getImplementationVersion
  }

  // Secondary constructor accepting a String object
  def this(pkgName: String) = {
    this(getClass.getClassLoader.getDefinedPackage(pkgName))
    val packageHandle: Package = getClass.getClassLoader.getDefinedPackage(pkgName)
    assert(packageHandle != null,
      {
        "Cannot find package; available packages: " + Package.getPackages.mkString("\n")
      })
  }
}
