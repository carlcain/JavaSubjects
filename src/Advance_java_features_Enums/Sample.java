package Advance_java_features_Enums;

public enum Sample 
{
    one(1,"user1"),
    two(2,"user2"),
    three(3,"user3");

    private final int id;
    private final String name;

    Sample(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
