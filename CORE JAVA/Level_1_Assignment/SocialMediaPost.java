class SocialMediaPost {
	public void createPost() {
		System.out.println("Post created");
        SocialMediaPost post1 = new SocialMediaPost();
        post1.publishPost();
        generatePostID();
	}
	public void publishPost() {
        System.out.println("Post published");
    }
    public static void generatePostID() {
        System.out.println("Post ID generated");
    }
	public static void main(String[] args) {
	    SocialMediaPost post2 = new SocialMediaPost();
		post2.createPost();
	}
}