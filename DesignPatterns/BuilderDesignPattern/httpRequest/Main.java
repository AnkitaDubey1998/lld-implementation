package DesignPatterns.BuilderDesignPattern.httpRequest;

public class Main {

    public static void main(String[] args) {
        // GET request
        HttpRequest getRequest = new HttpRequest.HttpRequestBuilder("https://api.example.com/users")
                .method("GET")
                .header("Accept", "application/json")
                .timeout(5000)
                .build();
        System.out.println("GET Request: " + getRequest.toString());

        // POST request
        HttpRequest postRequest = new HttpRequest.HttpRequestBuilder("https://api.example.com/posts")
                .method("POST")
                .header("Content-Type", "application/json")
                .header("X-Auth-Token", "some_secret_token")
                .body("{\"title\":\"New Post\",\"content\":\"Hello Builder!\"}")
                .queryParam("userId", "123")
                .build();
        System.out.println("POST Request: " + postRequest.toString());

        // Default request
        HttpRequest defaultRequest = new HttpRequest.HttpRequestBuilder("https://api.example.com/status").build();
        System.out.println("Default Request: " + defaultRequest);

        // Illustrating potential warning from builder
        HttpRequest putNoBodyRequest = new HttpRequest.HttpRequestBuilder("https://api.example.com/resource/1")
                .method("PUT")
                // .body("updated data") // Body intentionally omitted
                .build();
        System.out.println("PUT Request (no body): " + putNoBodyRequest);

        // Example of trying to build with invalid required parameter
        try {
            HttpRequest invalidRequest = new HttpRequest.HttpRequestBuilder(null).build();
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating request: " + e.getMessage());
        }
    }

}
