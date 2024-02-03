package builderPattern;

public class EcommerceApp
{
    public static void main(String[] args)
    {
        User myUser = new User.UserBuilder()
                .email("sofia.cordero@neu.edu.ph")
                .address("North Fairview Philippines")
                .phone("097832648")
                .age(20)
                .firstName("Sofia Gwyneth")
                .lastName("Cordero")
                .build();

        System.out.println("Name: " + myUser.firstName + " " + myUser.lastName);
        System.out.println("Email: " + myUser.email);
        System.out.println("Address: " + myUser.address);
        System.out.println("Phone: " + myUser.phone);
        System.out.println("Age: " + myUser.age);
    }
}

