package com.coffeepoweredcrew.abstractfactory2;

import com.coffeepoweredcrew.abstractfactory2.aws.AwsResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageCapacity) {
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(storageCapacity);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
    	Client client = new Client(new AwsResourceFactory());
        Instance il = client.createServer(Instance.Capacity.micro, 20440);
        il.start();
        il.stop();

        System.out.println("===============");
        Client googleClient = new Client(new GoogleResourceFactory());
        Instance gl = googleClient.createServer(Instance.Capacity.micro, 20440);
        gl.start();
        gl.stop();
    }

}
