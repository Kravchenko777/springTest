package com.xammax;

/*import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;
import com.xammax.utils.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;*/
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class GraphQlMyTest {

   /* @Autowired
    GraphQLTestTemplate graphQLTestTemplate;

    @Test
    void test() throws IOException {
        GraphQLResponse graphQLResponse = graphQLTestTemplate.perform("graphql/user.graphql");
        System.out.println(graphQLResponse.getStatusCode());
    }*/
}
