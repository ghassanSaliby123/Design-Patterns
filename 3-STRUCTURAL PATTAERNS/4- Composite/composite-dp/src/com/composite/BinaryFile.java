package com.composite;

//Leaf node in composite pattern
public class BinaryFile extends File
{
	private long size;
	private String name;

	public BinaryFile(String name, long size)
	{
		super(name);
		this.size = size;
	}

	@Override
	public void ls()
	{
		System.out.println(this.name + " " + this.size);
	}

	@Override
	public void addFile(File file)
	{
		throw new UnsupportedOperationException("Leaf node does not support adding files");
	}

	@Override
	public File[] getFiles()
	{
		throw new UnsupportedOperationException("Leaf node does not support getting files");
	}

	@Override
	public boolean removeFile(File file)
	{
		throw new UnsupportedOperationException("Leaf node does not support removing files");
	}
}
