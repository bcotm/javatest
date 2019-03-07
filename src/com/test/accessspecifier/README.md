# 访问修饰符测试
## 访问修饰符描述
* **default**: *package，同一包内均可访问。*
* **public**: *everything，任何地方均可访问。*
* **private**: *inside class(object)，仅在对象内可以访问。*
* **protected**: *subclass and package，子类和同一包下可以访问。*

> 继承后不能缩小**访问修饰符**范围，即parent public，child不能private。
> 继承后不能扩大所抛**异常**范围，即parent NullPointerException，child不能