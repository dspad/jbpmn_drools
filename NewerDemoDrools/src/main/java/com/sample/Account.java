package com.sample;

public class Account {
    private long money;
    private String name;
    // getters and setters omitted for brevity
    @Override
    public String toString() {
        return "Account [money=" + money + ", name=" + name + "]";
    }
    public Account() {    
    }
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
