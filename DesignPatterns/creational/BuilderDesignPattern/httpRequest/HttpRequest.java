package DesignPatterns.creational.BuilderDesignPattern.httpRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String url;         // Required
    private String method;      // Optional, default GET
    private Map<String, String> headers; // Optional
    private Map<String, String> queryParams; // Optional
    private String body;        // Optional
    private int timeout;

    // Private constructor, only accessible by the Builder
    private HttpRequest(HttpRequestBuilder httpRequestBuilder) {
        this.url = httpRequestBuilder.url;
        this.method = httpRequestBuilder.method;
        this.headers = Collections.unmodifiableMap(new HashMap<>(httpRequestBuilder.headers)); // Defensive copy
        this.queryParams = Collections.unmodifiableMap(new HashMap<>(httpRequestBuilder.queryParams)); // Defensive copy
        this.body = httpRequestBuilder.body;
        this.timeout = httpRequestBuilder.timeout;
    }



    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParams +
                ", body='" + (body != null ? body.substring(0, Math.min(10, body.length()))+"..." : "null") + '\'' +
                ", timeout=" + timeout +
                '}';
    }



    /***** Static Nested Builder Class *****/
    public static class HttpRequestBuilder {
        // Required parameter
        private final String url;

        // Optional parameters - initialized to default values
        private String method = "GET";
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> queryParams = new HashMap<>();
        private String body = null;
        private int timeout = 30000;  // 30 seconds default

        public HttpRequestBuilder(String url) {
            if(url == null || url.trim().isEmpty()) {
                throw new IllegalArgumentException("URL cannot be null or empty.");
            }
            this.url = url;
        }

        /* Setter-like methods for optional fields, returning the Builder for fluency */
        public HttpRequestBuilder method(String method) {
            this.method = (method == null || method.trim().isEmpty()) ? "GET" : method.toUpperCase();
            return this;
        }

        public HttpRequestBuilder header(String key, String value) {
            if (key != null && value != null) {
                this.headers.put(key, value);
            }
            return this;
        }

        public HttpRequestBuilder queryParam(String key, String value) {
            if (key != null && value != null) {
                this.queryParams.put(key, value);
            }
            return this;
        }

        public HttpRequestBuilder body(String body) {
            this.body = body;
            return this;
        }

        public HttpRequestBuilder timeout(int timeoutMillis) {
            if (timeoutMillis > 0) {
                this.timeout = timeoutMillis;
            }
            return this;
        }

        // The final build method that creates the HttpRequest object
        public HttpRequest build() {
            // Optionally, add validation logic here before creating the object
            // For example, ensure body is present for POST/PUT if required by your design
            if (("POST".equals(method) || "PUT".equals(method)) && (body == null || body.isEmpty())) {
                System.out.println("Warning: Building " + method + " request without a body for URL: " + url);
            }
            return new HttpRequest(this);
        }
    }
}
