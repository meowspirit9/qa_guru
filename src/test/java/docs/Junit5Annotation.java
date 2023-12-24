package docs;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Junit5Annotation {

    @BeforeAll
    static void setup() {
     System.out.println("setup here");
    }

            @BeforeEach
            void each() {
                System.out.println("    beforeEach here");
            }

                    @Test
                    @DisplayName("      some Test")
                    void someTest() {
                        System.out.println("            someTest here");
                        assertTrue(true);
                    }

                    @Test
                    @DisplayName("      another Test")
                    void anotherTest() {
                        System.out.println("            anotherTest here");
                        assertTrue(true);
                    }

            @AfterEach
            void after() {
                System.out.println("    AfterEach here");
            }

    @AfterAll
    static void ShutDown() {
        System.out.println("ShutDown here");
    }

}


//    setup here
 //         beforeEach here
 //                 anotherTest here
 //         AfterEach here
//          beforeEach here
 //                 someTest here
 //         AfterEach here
 //   ShutDown here