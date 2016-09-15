### What is [Junit]([http://download.sourceforge.net/junit/](http://download.sourceforge.net/junit/)?)

Junit is a simple framework to write **repeatable** tests.It is an instance of the xUnit architecture for unit test frameworks.


- PythonUnit
- CppUnit
- JUnit

### How To Implement

- We need to add anotation @Test for every method
- the modifier of the tested method  should be **public  void** no parameters
- Create a source code directory to store our testing code
- Testing package should be consistent with the Tested package
- Every method in testing unit can be tested **independently**, there shouldnot have any dependence between each methods.
- The **tested Class** should have `Test` as suffix
- The **tested Method** should use `test` as prefix
- Add “?:＼Junit4.0\Junti.jar” to the **batch** file

#### Reminding

- The testing sample测试用例不是用来证明你是对的，而是用来证明你没有错

- The testing sample cannot detect logical error, only can detect the techincal errors. 

- Failure is  Failure一般由单元测试使用的断言方法判断失败所引起的，这表示测试点发现了问题，就是说程序输出的结果和我们预期的不一样    

- error is cause by exception, it could be a hiddenbug in **testing code**  itself. 

  | Method                   | Annotation(after Junit 4) |
  | ------------------------ | ------------------------- |
  | **`setUp()`**            | **@Before**               |
  | **`tearDown()`**         | **@BeforeClass**          |
  | **`setUpBeforeClass()`** | **@After**                |
  | **`tearDownAfterClass`** | **@AfterClass**           |

**Assert:**`import static junit.framework.Assert.fail;`

`import static junit.framework.Assert.assertEquals;`

A set of assertion methods useful for writing tests. Only **failed assertions** are recorded. These methods can be used directly: `Assert.assertEquals(...)`, however, they read better if they are referenced through static import:



**Test:**  `import org.junit.Test;`

The `Test` annotation tells JUnit that the **`public void`** method to **which it is attached** can be run as a test case. To run the method, JUnit first constructs a fresh instance of the class then invokes the annotated method. Any exceptions thrown by the test will be reported by JUnit as a failure. If no exceptions are thrown, the test is assumed to have succeeded.



**Test suite** is used to bundle a few unit test cases and run them together. In JUnit, both **@RunWith** and **@Suite** annotations are used to run the suite tests. This chapter takes an example having two test classes, TestJunit1 & TestJunit2, that run together using Test Suite`



### Common Annotation

- **@Test** modify a normal method to a tested method
  **@Test**(expected = XX.class)
  **@Test**(timeout in millisecond)  
- **@BeforeClass** will be excuted **before** all method execution，use static modifier
- **@AfterClass** 它会在所有的方法运行结束后被执行，static修饰
- **@Before** 会在每一个测试方法被运行前执行一次
- **@After** 会在每一个测试方法运行后被执行一次
- **@Ignore** *temporarily* disable a test or a group of tests
- **@RunWith** will change the testing Executors and inherited org.junit.runner.Runner

### test suite

- what(测试套件就是组织测试类一起运行的)
- how
  - Write at写一个作为测试套件的入口类，这个类里不包含其他的方法
  - Change the Executor to Suite.class
  - Pass the tested class as arrays to Suite.SuiteClasses({})

### Junit Parameter setting

- Change the default testing executor as RunWith(Parameterized.class)
- Declare variable to store the expected value and result value
- Declare a return value **Collection** using public ，also add @Parameters as annotation
- Set a common constructor for testing class, and instantiate value for the variable






