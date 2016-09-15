1. add Hamcrest to avoid the problem of `NoClassDefFoundError: org/hamcrest/SelfDescribing

   ### 

   JUnit和Hamcrest is different framework。But JUnit implements Hamcrest. Using Hamcrest can code simpilified Test code.

   Hamcreast is a testing framework. It provide a set of "Matcher", it is convenient for developers to set the rules by using the `Matcher` 





Instead of using

|               | JUnit                                    | Hamcrest                                 |
| ------------- | ---------------------------------------- | ---------------------------------------- |
| **Methods**   | **`assertEquals(expected, actual);`**    | **`assertThat(actual, is(equalTo(expected)));`** |
| **Type Safe** | assertEquals("abc", 123); //compiles, but fails | assertThat(123, is("abc")); //does not compile |
|               |                                          |                                          |

 JUnit's `assertEquals` methods, we use Hamcrest's `assertThat`

