package com.objectpool;

public class Client {

    public static final int POOL_SIZE = 5;
    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Bitmap"), POOL_SIZE);

    public static void main(String[] args) {
        Bitmap bitmap1 = bitmapPool.get();
        bitmap1.setLocation(new Point2D(1, 1));
        Bitmap bitmap2 = bitmapPool.get();
        bitmap2.setLocation(new Point2D(2, 2));

        bitmap1.draw();
        bitmap2.draw();

        bitmapPool.release(bitmap1);
        bitmapPool.release(bitmap2);
    }
}
