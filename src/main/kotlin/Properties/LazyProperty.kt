package Properties

class LazyProperty(val initializer: () -> Int) {
    var num: Int? = null;
    val lazy: Int
        get() {
            if(num == null){
                num = initializer()
            }
            return num!!
        }
}