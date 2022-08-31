package com.xammax;

import com.xammax.utils.MockService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class TestMockito {

    @Autowired
    private MockService service;

    private static MockService mockService;

    private MockService spyService;

    @BeforeAll
    static void init(){
        mockService = Mockito.mock(MockService.class);
        Mockito.when(mockService.doWork()).thenReturn("1232323");
        Mockito.doReturn(false).when(mockService).isWork();
        Mockito.doThrow(NullPointerException.class).when(mockService).init();

    }

    @Test
    void testSpy(){
        spyService = Mockito.spy(service);
        System.out.println(service.doWork());
        System.out.println(mockService.doWork());
        System.out.println(spyService.doWork());
        System.out.println(mockService.isWork());
        //mockService.init();

        Mockito.when(mockService.doWork(any(),any())).thenReturn("88888");
        System.out.println(mockService.doWork("34234","6666"));

        Mockito.when(mockService.doWork("3333")).thenReturn("9999999");
        System.out.println(mockService.doWork("3333"));

        Mockito.when(mockService.doWork(Mockito.argThat(argument -> argument.length()>6))).thenReturn("00000000");
        System.out.println(mockService.doWork("33334444444"));
        System.out.println(mockService.doWork("3333"));

        Mockito.verify(mockService).doWork();
       // Mockito.verify(mockService,Mockito.times(2)).doWork(any());

    }

    @Test
    void testMock(){

    }
}
