package com.liangxu.effectivejava.chapter03.paragraph02.demo01;// Public class with exposed immutable fields - questionable

public final class Time {
    /*

        虽然公共类直接暴露属性并不是一个好主意，但是如果属性是不可变的，那么危害就不那么大了。当一个属性是只读的时候，
        除了更改类的 API
        外，你不能改变类的内部表示形式，也不能采取一些辅助的行为，但是可以加强不变性。例如，下面的例子中保证每个实例表示一个有效的时间：

        总之，公共类不应该暴露可变属性。 公共类暴露不可变属性的危害虽然仍然存在问题，但其危害较小。
         然而，有时需要包级私有或私有内部类来暴露属性，无论此类是否是可变的。

    */
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    public final int hour;
    public final int minute;

    public Time(int hour, int minute) {
        if (hour < 0 || hour >= HOURS_PER_DAY)
            throw new IllegalArgumentException("Hour: " + hour);
        if (minute < 0 || minute >= MINUTES_PER_HOUR)
            throw new IllegalArgumentException("Min: " + minute);
        this.hour = hour;
        this.minute = minute;
    }


}
