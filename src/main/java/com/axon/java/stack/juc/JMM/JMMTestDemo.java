package com.axon.java.stack.juc.JMM;

/**
 *  1.什么是JMM
 *      JMM 是一种内存模型，为了屏蔽各个硬件以及操作系统访问内存的差异性，而推出的一种内存模型，
 *      保证java应用程序在各个平台和操作系统之间访问内存的一致性。
 *  2.JMM 保证了 内存访问  有序性、原子性、可见性。
 *
 *  3.JMM 遵循happen_before 先行发生的原则。
 *
 *
 *  chatGpt总结：
 *
 *  结中对 JMM（Java 内存模型）的描述是基本准确的，但可以进行更详细和全面的优化和扩展。以下是优化后的总结：
 *
 * 优化后的总结：
 *
 * 	1.	什么是 JMM：
 * 	•	Java 内存模型（Java Memory Model，JMM） 是 Java 语言规范的一部分，它定义了多线程环境下变量（包括实例字段、静态字段和数组元素）如何在内存中存储和访问。
 * 	•	JMM 的主要目标是屏蔽不同硬件架构和操作系统对内存访问的差异，为 Java 程序提供一致且可预测的行为。通过 JMM，开发者可以编写在所有平台上都能正确运行的多线程 Java 程序。
 * 	2.	JMM 保证的三大特性：
 * 	•	原子性：JMM 保证基本的读写操作是不可分割的，即原子操作。例如，对 int 类型的变量进行赋值操作是原子的。
 * 	•	可见性：JMM 保证一个线程对变量的修改能够被其他线程及时看到。这可以通过 volatile 关键字、锁（synchronized）等机制来实现。
 * 	•	有序性：JMM 保证指令执行的顺序性，尤其是在多线程环境下的内存操作顺序。虽然编译器和 CPU 可能会进行指令重排序，但 JMM 通过一些规则确保最终执行的结果符合程序逻辑。
 * 	3.	happens-before 规则：
 * 	•	JMM 通过一系列 happens-before 规则来定义线程之间的执行顺序，从而保证正确的内存可见性和有序性。
 * 	•	常见的 happens-before 规则包括：
 * 	•	单线程中的操作，前面的操作 happens-before 后面的操作。
 * 	•	锁的释放 happens-before 同一锁的获取。
 * 	•	volatile 变量的写操作 happens-before 该变量的读操作。
 * 	•	线程的启动操作 happens-before 线程中的任何操作。
 * 	•	线程中的所有操作 happens-before 该线程的终止。
 *
 * 扩展：
 *
 * 	4.	指令重排序：
 * 	•	JMM 允许编译器和处理器进行指令重排序以优化性能，但在保证 happens-before 关系的情况下，不会影响程序的正确性。
 * 	•	volatile、synchronized、final 等关键字可以用于控制和防止指令重排序，以确保多线程环境下的正确性。
 * 	5.	内存屏障：
 * 	•	为了实现 JMM 的保证，JVM 在适当的时候插入内存屏障（Memory Barriers），以阻止 CPU 或编译器进行危险的重排序。
 * 	6.	线程与主内存的交互：
 * 	•	在 JMM 中，每个线程都有自己的工作内存（本地缓存），它保存了该线程使用的变量的副本。线程对变量的所有操作都在工作内存中进行，线程之间的通信则通过主内存来实现。
 * 	•	当一个线程修改了变量并刷新到主内存中，其他线程才会看到这个变化。
 * 	7.	常见误区：
 * 	•	JMM 并不保证所有变量的访问都是线程安全的。只有 volatile 修饰的变量或通过锁机制保护的代码块才能保证可见性和有序性。
 * 	•	原子性仅限于单个操作。对于复合操作（如递增操作 i++），需要额外的同步措施。
 *
 */
public class JMMTestDemo {

    public static void main(String[] args) {

    }
}
