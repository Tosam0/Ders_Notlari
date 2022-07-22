public class ProfileText {
    public static void main(String[] args) {
       // Profile profile1 = new Profile();

        Profile1 profile = Profile1.newInstance();
        profile.setCounter(1);

        Profile1 profile2 = Profile1.newInstance();
        profile2.setCounter(1);

        Profile1 profile3 = Profile1.newInstance();
        profile3.setCounter(1);

        System.out.println(profile.getCounter());
        System.out.println(profile2.getCounter());
        System.out.println(profile3.getCounter());


        Profile1 profile6 = Profile1.newInstance();
        profile6.name ="Ahmet";
    }
}
