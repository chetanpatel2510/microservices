
/**
 * This class will have all the constants related to Http.
 */
export class HttpConstants {
    /**
     * Http Method name GET.
     */
    public static HTTP_METHOD_GET = "GET";

    /**
     * Http Method name Post.
     */
    public static HTTP_METHOD_POST = "POST";

    /**
     * Host name for the Zuul proxy. All the http calls should pass through zuul gateway.
     */
    public static TARGET_HOST = "http://localhost:9000";
}