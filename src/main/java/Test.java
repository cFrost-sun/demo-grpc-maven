import io.grpc.examples.helloworld.HelloRequest;

public class Test {
    public static void main(String[] args) {
        HelloRequest helloRequest = HelloRequest.newBuilder().setName("helloworld").build();
        System.out.println(helloRequest.getName());
    }
}
