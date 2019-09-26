package com.liangxu.effectivejava.chapter03.paragraph03.demo01;// Immutable complex number class

public final class Complex {

/*
    不可变类简单来说是它的实例不能被修改的类。包含在每个实例中的所有信息在对象的生命周期中是固定的，因此不会观察到任何变化。
    Java 平台类库包含许多不可变的类，
    包括 String
    类，
    基本类型包装类以及 BigInteger
    类和 BigDecimal
    类。有很多很好的理由：不可变类比可变类更容易设计，实现和使用。他们不太容易出错，更安全。

            　　要使一个类不可变，请遵循以下五条规则：

    不要提供修改对象状态的方法（
    也称为 mutators）。
    确保这个类不能被继承。这可以防止粗心的或恶意的子类，假设对象的状态已经改变，从而破坏类的不可变行为。防止子类化通常是通过 final 修饰类，但是我们稍后将讨论另一种方法。
    把所有属性设置为 final。通过系统强制执行，清楚地表达了你的意图。另外，如果一个新创建的实例的引用从一个线程传递到另一个线程而没有同步，就必须保证正确的行为，正如内存模型[JLS，17.5;Goetz06,16]所述。
    把所有的属性设置为 private。这可以防止客户端获得对属性引用的可变对象的访问权限并直接修改这些对象。虽然技术上允许不可变类具有包含基本类型数值的公共 final 属性或对不可变对象的引用，但不建议这样做，因为它不允许在以后的版本中更改内部表示（详见第 15和 16条）。
    确保对任何可变组件的互斥访问。如果你的类有任何引用可变对象的属性，请确保该类的客户端无法获得对这些对象的引用。切勿将这样的属性初始化为客户端提供的对象引用，或从访问方法返回属性。在构造方法，
    访问方法和 readObject
    方法（详见第 88条）中进行防御性拷贝（详见第 50条）。
    以前条目中的许多示例类都是不可变的。其中这样的类是条目 11
    中的 PhoneNumber
    类，它具有每个属性的访问方法（accessors），但没有相应的设值方法（mutators）。这是一个稍微复杂一点的例子：
*/

    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im,
                re * c.im + im * c.re);
    }

    public Complex dividedBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                (im * c.re - re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Complex)) {
            return false;
        }

        Complex c = (Complex) o;

        // See page 47 to find out why we use compare instead of ==
        return Double.compare(c.re, re) == 0
                && Double.compare(c.im, im) == 0;

    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
