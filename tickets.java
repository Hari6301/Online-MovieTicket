import java.util.*;

class ticket {
	static Scanner sc = new Scanner(System.in);
	static long amount = 0;
	static String name = "";
	static String location = "";
	static String movie_name = "";
	static String Theater_name = "";
	static int nooftickets = 0;
	static String show_time = "";
	static {
		System.out.println("Hello welcome to the movie tickets");
		System.out.println("Login or Register");
	}

	static String login(String first)

	{
		if (first.equalsIgnoreCase("Register")) {
			System.out.println("Please enter your first name:");
			String Firstname = sc.next();
			name = Firstname;
			System.out.println("Enter your Gmail");
			String Gmail = sc.next();

			System.out.println("please create a login password for login:");
			String pass = sc.next();
			System.out.println("please confirm your password");
			String verpass = sc.next();
			while (!verpass.equalsIgnoreCase(pass)) {
				System.out.println("you entered incorrect password");
				verpass = sc.next();
			}
			System.out.println("correct password");
			System.out.println("enter login");
			String first1 = sc.next();
			while (!(first1.equalsIgnoreCase("login"))) {
				System.out.println("you have to login compulsory to move ahead");
				first1 = sc.next();
			}
			if (first1.equalsIgnoreCase("Login")) {
				System.out.println("please enter your gmail:");
				String username = sc.next();
				System.out.println("please enter your password ");
				String userpass = sc.next();
				while (!((username.equalsIgnoreCase(Gmail)) && (userpass.equalsIgnoreCase(pass)))) {
					System.out.println("Login failed please check the details you have entered");
					System.out.println("please enter your gmail:");
					username = sc.next();
					System.out.println("please enter your password to login");
					userpass = sc.next();

				}
				System.out.println("Login successfully");
			}
		} else {
			System.out.println("Enter your user name:");
			String us = sc.next();
			System.out.println("Enter the password");
			String pa = sc.next();
			System.out.println("Invalid credentials");
			System.out.println("Without registration you can not login. so go for the registraction first");
			System.out.println("Please Register");
			return login(sc.next());
		}
		return m2();

	}

	// from here login page

	static String m2() {
		String s = "";
		String one = "";
		String two = "";
		String three = "";
		String four = "";
		System.out.println("Please Enter any one of the Location Given Below :");
		System.out.print("1. Hyderabad\n2. Mumbai\n3. Bengaluru\nEnter: ");
		String loc = sc.next();
		while (!((loc.equalsIgnoreCase("1")) || (loc.equalsIgnoreCase("2")) || (loc.equalsIgnoreCase("3")))) {
			System.out.println("You selected invalid location, so select from 1 to 3");
			loc = sc.next();
		}
		if (loc.equalsIgnoreCase("1")) {
			location = "Hyderabad";
			System.out.println("List of Movies in Hyderabad Location:");
			System.out.println("1.Skanda\n2.Akanda\n3.Salar\n4.Robo");
			System.out.println("enter your movie ");
			String s1 = sc.next();
			one = "Skanda";
			two = "Akanda";
			three = "Salar";
			four = "Robo";
			while (!((s1.equalsIgnoreCase(one)) || (s1.equalsIgnoreCase(two)) || (s1.equalsIgnoreCase(three))
					|| (s1.equalsIgnoreCase(four)))) {
				System.out.println("select valid movie ");
				s1 = sc.next();
			}
			if (s1.equalsIgnoreCase(one)) {
				movie_name = one;
				System.out.println("selected movie is :" + one);
				System.out.println("Please Enter the Theatre name:");
				System.out.println("1.Vimal\n2.INOx\n3.PVR\n4.Sandhya");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("vimal") || (T.equalsIgnoreCase("inox") || (T.equalsIgnoreCase("pvr"))
						|| (T.equalsIgnoreCase("sandhya"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter a number to select a show time: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 4:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;

				}
			} else if (s1.equalsIgnoreCase(two)) {
				movie_name = two;
				System.out.println("1.Miraj\n2.PVRICON\n3.PVRArtium\n4.INOXGVK");
				System.out.println("Please Enter the Theatre name:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("Miraj") || (T.equalsIgnoreCase("PVRICON")
						|| (T.equalsIgnoreCase("PVRArtium")) || (T.equalsIgnoreCase("INOX GVK"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.nextLine();
				}
				Theater_name = T;
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 4:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;

				}
			} else if (s1.equalsIgnoreCase(three)) {
				movie_name = three;
				System.out.println("selected movie is :" + three);
				System.out.println("1.Sangeetha\n2.INOX\n3.PVR\n4.Platinum");
				System.out.println("Please Enter the Theatre name:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("Sangeetha") || (T.equalsIgnoreCase("INOX") || (T.equalsIgnoreCase("PVR"))
						|| (T.equalsIgnoreCase("Platinum"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 3:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;
				}
			} else if (s1.equalsIgnoreCase(four)) {
				movie_name = four;
				System.out.println("selected movie is :" + four);
				System.out.println("1.GSM\n2.Srilaxmi\n3.PVRNexus\n4.Sreeramana");
				System.out.println("Please Enter the Theatre name:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("GSM") || (T.equalsIgnoreCase("Srilaxmi")
						|| (T.equalsIgnoreCase("PVRNexus")) || (T.equalsIgnoreCase("Sreeramana"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 3:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;
				}
			}
		} else if (loc.equalsIgnoreCase("2")) {
			location = "Mumbai";
			System.out.println("List of Movies in Mumbai Location:");
			System.out.println("1.Jailer\n2.Animal\n3.Creator\n4.Thankyou");
			System.out.println("enter your movie ");
			String s2 = sc.next();
			one = "Jailer";
			two = "Animal";
			three = "Creator";
			four = "Thankyou";
			while (!((s2.equalsIgnoreCase(one)) || (s2.equalsIgnoreCase(two)) || (s2.equalsIgnoreCase(three))
					|| (s2.equalsIgnoreCase(four)))) {
				System.out.println("select valid movie ");
				s2 = sc.next();
			}
			if (s2.equalsIgnoreCase(one)) {
				movie_name = one;
				System.out.println("selected movie is :" + one);
				System.out.println("1.INOXR-City\n2.Funcinema\n3.Barath\n4.Premiergold ");
				System.out.println("Please Enter the Theatre:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("inoxr-city") || (T.equalsIgnoreCase("funcinema")
						|| (T.equalsIgnoreCase("barath")) || (T.equalsIgnoreCase("premier"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 4:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;

				}
			} else if (s2.equalsIgnoreCase(two)) {
				movie_name = two;
				System.out.println("selected movie is :" + two);
				System.out.println("1.PVR\n2.Miraj\n3.SM5kalyan\n4.NY");
				System.out.println("Please Enter the Theatre:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("PVR") || (T.equalsIgnoreCase("Miraj") || (T.equalsIgnoreCase("SM5kalyan"))
						|| (T.equalsIgnoreCase("NY"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 4:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;

				}
			} else if (s2.equalsIgnoreCase(three)) {
				movie_name = three;
				System.out.println("selected movie is :" + three);
				System.out.println("1.INOX\n2.Gold\n3.PVRICON\n4.Viviana");
				System.out.println("Please Enter the Theatre:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("INOX") || (T.equalsIgnoreCase("Gold") || (T.equalsIgnoreCase("PVRICON"))
						|| (T.equalsIgnoreCase("Viviana"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 4:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 PM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;

				}
			} else if (s2.equalsIgnoreCase(four)) {
				movie_name = four;
				System.out.println("selected movie is :" + four);
				System.out.println("1.Cinepolis\n2.Starmiraj");
				System.out.println("Please Enter the Theatre:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("Cinepolis") || (T.equalsIgnoreCase("Starmiraj")))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 4:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;

				}
			}
		} else if (loc.equalsIgnoreCase("3")) {
			location = "Bengaluru";
			System.out.println("List of Movies in Bengaluru Location:");
			System.out.println("1.LEO\n2.Tiger\n3.Jawan\n4.MAD");
			System.out.println("enter your movie ");
			String s3 = sc.next();
			one = "LEO";
			two = "Tiger";
			three = "Jawan";
			four = "MAD";
			while (!((s3.equalsIgnoreCase("leo")) || (s3.equalsIgnoreCase("tiger")) || (s3.equalsIgnoreCase("jawan"))
					|| (s3.equalsIgnoreCase("mad")))) {
				System.out.println("select valid movie ");
				s3 = sc.next();
			}
			if (s3.equalsIgnoreCase(one)) {
				movie_name = one;
				System.out.println("selected movie is :" + one);
				System.out.println("1.Vibhav\n2.Prakash\n3.Bharthiya");
				System.out.println("Please Enter the Theatre:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("Vibhav")
						|| (T.equalsIgnoreCase("Prakash") || (T.equalsIgnoreCase("Bharthiya"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 4:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;

				}
			} else if (s3.equalsIgnoreCase(two)) {
				movie_name = two;
				System.out.println("selected movie is :" + two);
				System.out.println("1.MSR\n2.INOX\n3.Vaishnavi");
				System.out.println("Please Enter the Theatre:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("MSR")
						|| (T.equalsIgnoreCase("INOX") || (T.equalsIgnoreCase("Vaishnavi"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 4:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;

				}
			} else if (s3.equalsIgnoreCase(three)) {
				movie_name = three;
				System.out.println("selected movie is :" + three);
				System.out.println("1.PVR\n2.INOX\n3.Bhoomika\n4.Cinepoils");
				System.out.println("Please Enter the Theatre:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("PVR") || (T.equalsIgnoreCase("INOX") || (T.equalsIgnoreCase("Bhoomika"))
						|| (T.equalsIgnoreCase("Cinepoils"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 4:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;

				}
			} else if (s3.equalsIgnoreCase(four)) {
				movie_name = four;
				System.out.println("selected movie is :" + four);
				System.out.println("1.Cinepolis\n2.PVR\n3.INOX\n4.Innovative");
				System.out.println("Please Enter the Theatre:");
				String T = sc.next();
				while (!(T.equalsIgnoreCase("Cinepolis") || (T.equalsIgnoreCase("PVR") || (T.equalsIgnoreCase("INOX"))
						|| (T.equalsIgnoreCase("Innovative"))))) {
					System.out.println("plese enter valid theater name :");
					T = sc.next();
				}
				Theater_name = T;
				System.out.println("selected Theatre is :" + T);
				System.out.print(
						"Select a show time :	1. 11:00 AM\n			2. 2:00 PM\n			3. 6:00 PM\n			4. 9:00 PM\nEnter: ");
				String x = sc.next();
				while (!((x.equalsIgnoreCase("1")) || (x.equalsIgnoreCase("2")) || (x.equalsIgnoreCase("3"))
						|| (x.equalsIgnoreCase("4")))) {
					System.out.println("enter valid time and enter from 1 to 4:");
					x = sc.next();
				}
				switch (x) {
					case "1":
						System.out.println("Selected show time is 11:00 AM");
						show_time = "11:00 AM";
						break;
					case "2":
						System.out.println("Selected show time is 2:00 PM");
						show_time = "2:00 PM";
						break;
					case "3":
						System.out.println("Selected show time is 6:00 PM");
						show_time = "6:00 PM";
						break;
					case "4":
						System.out.println("Selected show time is 9:00 PM");
						show_time = "9:00 PM";
						break;

				}
			}
		}

		return m3();
	}

	static String m3() {
		System.out.println("P for platinum class         --->     A to D   ----->    each ticket cost is 250Rs");
		System.out.println("G for gold class             --->     E to H   ----->    each ticket cost is 150Rs");
		System.out.println("s for silver class           --->     I to L   ----->    each ticket cost is 100Rs");
		System.out.println("enter your class p or g or s");
		String p = "P";
		String g = "G";
		String s = "S";
		String seat1 = sc.next();
		while (!((seat1.equalsIgnoreCase(p)) || (seat1.equalsIgnoreCase(g)) || (seat1.equalsIgnoreCase(s)))) {
			System.out.println("select valid class");
			seat1 = sc.next();
		}
		// System.out.println("you selected "+seat1+" class");
		if (seat1.equalsIgnoreCase(p)) {
			System.out.println("you were selected platinum class");
			System.out.println("select row Like A to D");
			String seat2 = sc.next();
			String a = "A";
			String b = "B";
			String c = "C";
			String d = "D";
			while (!((seat2.equalsIgnoreCase(a)) || (seat2.equalsIgnoreCase(b)) || (seat2.equalsIgnoreCase(c))
					|| (seat2.equalsIgnoreCase(d)))) {
				System.out.println("you enterd " + seat2 + " not in the range please provide valid data");
				seat2 = sc.next();
			}
			System.out.println("your row of the seat is :" + seat2);
			// System.out.println("each ticket cost in pa");
			System.out.println("Enter no of seats you want: ");
			int sn = sc.nextInt();
			// System.out.println(sn);
			nooftickets = sn;
			System.out.println("select your seat number from 1 to 20");
			int a1[] = new int[sn];
			int c11 = 0;
			for (int i = 0; i < sn; i++) {
				a1[i] = sc.nextInt();
				while (!(a1[i] >= 1 && a1[i] <= 20)) {
					System.out.println("you entered seat number " + a1[i] + " is not valid enter valid seat number ");
					a1[i] = sc.nextInt();
				}
				c11++;
				int j = 0;
				while (j < c11 - 1) {
					if ((a1[i] == a1[j])) {
						System.out.println(
								"the seat number " + a1[i] + " is already confirmed please select another seat:");
						a1[i] = sc.nextInt();
					}
					j++;
				}
				while (!(a1[i] >= 1 && a1[i] <= 20)) {
					System.out.println("you entered seat number " + a1[i] + " is not valid enter valid seat number ");
					a1[i] = sc.nextInt();
				}
			}
			System.out.print("seats number :");
			for (int i = 0; i < sn; i++) {
				System.out.print(a1[i] + " ");
			}
			System.out.println("are confirmed");
			amount = sn * 250;
			System.out.println("you have to pay " + sn * 250 + "Rs");
		} else if (seat1.equalsIgnoreCase(g)) {
			System.out.println("you were selected gold class");
			System.out.println("select row Like E to H");
			String seat3 = sc.next();
			String e = "e";
			String f = "f";
			String g1 = "g";
			String h = "h";
			while (!((seat3.equalsIgnoreCase(e)) || (seat3.equalsIgnoreCase(f)) || (seat3.equalsIgnoreCase(g1))
					|| (seat3.equalsIgnoreCase(h)))) {
				System.out.println("you enterd " + seat3 + " not in the range please provide valid data");
				seat3 = sc.next();
			}
			System.out.println("your row of the seat is :" + seat3);
			System.out.println("Enter no of seats you want: ");
			int sn = sc.nextInt();
			// System.out.println(sn);
			nooftickets = sn;
			System.out.println("select your seat number from 21 to 40");
			int a2[] = new int[sn];
			int c21 = 0;
			for (int i = 0; i < sn; i++) {
				a2[i] = sc.nextInt();
				while (!(a2[i] >= 21 && a2[i] <= 40)) {
					System.out.println("you entered seat number " + a2[i] + " is not valid enter valid seat number ");
					a2[i] = sc.nextInt();
				}
				c21++;
				int j = 0;
				while (j < c21 - 1) {
					if ((a2[i] == a2[j])) {
						System.out.println(
								"the seat number " + a2[i] + " is already confirmed please select another seat:");
						a2[i] = sc.nextInt();
					}
					j++;
				}
				while (!(a2[i] >= 21 && a2[i] <= 40)) {
					System.out.println("you entered seat number " + a2[i] + " is not valid enter valid seat number ");
					a2[i] = sc.nextInt();
				}
			}
			System.out.print("seats number :");
			for (int i = 0; i < sn; i++) {
				System.out.print(a2[i] + " ");
			}
			System.out.println("are confirmed");
			amount = sn * 150;
			System.out.println("you have to pay " + sn * 150 + "Rs");
		} else if (seat1.equalsIgnoreCase(s)) {
			System.out.println("you were selected silver class");
			System.out.println("select row Like I to L");
			String seat4 = sc.next();
			String i = "i";
			String j = "j";
			String k = "k";
			String l = "l";
			while (!((seat4.equalsIgnoreCase(i)) || (seat4.equalsIgnoreCase(j)) || (seat4.equalsIgnoreCase(k))
					|| (seat4.equalsIgnoreCase(l)))) {
				System.out.println("you enterd " + seat4 + " not in the range please provide valid data");
				seat4 = sc.next();
			}
			System.out.println("your row of the seat is :" + seat4);

			System.out.println("Enter no of seats you want: ");
			int sn = sc.nextInt();
			nooftickets = sn;
			System.out.println("select your seat numbers from 41 to 100");
			int a3[] = new int[sn];
			int c31 = 0;
			for (int z = 0; z < sn; z++) {
				a3[z] = sc.nextInt();
				while (!(a3[z] >= 41 && a3[z] <= 100)) {
					System.out.println("you entered seat number " + a3[z] + " is not valid enter valid seat number ");
					a3[z] = sc.nextInt();
				}
				c31++;
				int j1 = 0;
				while (j1 < c31 - 1) {
					if ((a3[z] == a3[j1])) {
						System.out.println(
								"the seat number " + a3[z] + " is already confirmed please select another seat:");
						a3[z] = sc.nextInt();
					}
					j1++;
				}
				while (!(a3[z] >= 41 && a3[z] <= 100)) {
					System.out.println("you entered seat number " + a3[z] + " is not valid enter valid seat number ");
					a3[z] = sc.nextInt();
				}
			}
			System.out.print("seats number :");
			for (int z = 0; z < sn; z++) {
				System.out.print(a3[z] + " ");
			}
			System.out.println("are confirmed");
			amount = sn * 100;
			System.out.println("you have to pay " + sn * 100 + "Rs");
		}
		return m4();
	}

	static String m4() {
		System.out.println("\n---------------TICKET DETAILS----------------------\n");
		System.out.println("User name                   --->  " + name);
		System.out.println("Movie name                  --->  " + movie_name);
		System.out.println("Theatre name                --->  " + Theater_name);
		System.out.println("Show Time                   --->  " + show_time);
		System.out.println("Number of Tickets confirmed --->  " + nooftickets);
		System.out.println("Total Amount                --->  " + amount);
		System.out.println("-----------------------------------------------------\n");

		System.out.println("Go for the payment process");
		System.out.println("you can transfer money through phone pe or google pe or paytm");
		System.out.println("enter 1     ----->           phone pe");
		System.out.println("enter 2     ----->           google pe");
		System.out.println("enter 3     ----->           paytm");
		System.out.println("select any one of the payment method listed above :");
		String pp = "1";
		String gp = "2";
		String paytm = "3";
		String payment = sc.next();
		int flag = 0;
		while (!((payment.equalsIgnoreCase(pp)) || (payment.equalsIgnoreCase(gp))
				|| (payment.equalsIgnoreCase(paytm)))) {
			System.out.println(payment + " is not available plese select another one");
			payment = sc.next();
		}
		if (payment.equals(pp)) {
			System.out.println("you were selected phone pe complete the transaction");
			System.out.println("enter the amount:" + amount);
			long payamount = sc.nextLong();
			while (amount != payamount) {
				System.out.println("Enter exact " + amount + "Rupees :");
				payamount = sc.nextLong();
			}
			System.out.println("Complted the transaction succussfully ");
		} else if (payment.equals(gp)) {
			System.out.println("you were selected Googlepay complete the transaction");
			System.out.println("enter the amount:" + amount);
			long payamount = sc.nextLong();
			while (amount != payamount) {
				System.out.println("Enter exact " + amount + "Rupees :");
				payamount = sc.nextLong();
			}
			System.out.println("Complted the transaction succussfully ");
		} else if (payment.equals(paytm)) {

			System.out.println("you were selected Paytm complete the transaction");
			System.out.println("enter the amount:" + amount);
			long payamount = sc.nextLong();
			while (amount != payamount) {
				System.out.println("Enter exact " + amount + "Rupees :");
				payamount = sc.nextLong();
			}
			System.out.println("Transaction Completed succussfully ");
			//System.out.println("*Thanks for booking movie tickets using movie tickets booking system*");
			//System.out.println("+++++ENJOY THE MOVIE+++++");

		}

		return "j";
	}

	public static void main(String[] args) {
		login(sc.next());
	}
}
