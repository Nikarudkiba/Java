<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pet Paradise</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            background-color: #ffffff;
        }
        .header {
            background-color: #008cff;
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }
        .header h2 {
            margin: 0;
        }
        .header-right {
            display: flex;
            align-items: center;
        }
        .search-bar {
            padding: 6px 10px;
            margin-right: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            outline: none;
        }
        .cart-icon {
            width: 24px;
            height: 24px;
            margin-right: 10px;
        }
        .sidebar {
            background-color: #2302b5;
            padding: 15px;
            height: calc(250vh - 52px);
        }
        .sidebar a {
            display: block;
            padding: 8px 10px;
            margin: 5px 0;
            color: #fffefe;
            text-decoration: none;
            border-radius: 4px;
            transition: background-color 0.3s;
        }
        .sidebar a:hover {
            background-color: #e2e2e2;
        }
        #content {
            margin-left: 15px;
        }
        .content-section {
            display: flex;
            margin-bottom: 50px;
        }
        .content-section img {
            width: 200px;
            height: 200px;
            background: #ffffff;
            margin: 0 20px;
        }
        .content-section div {
            flex: 1;
        }
        @media (max-width: 968px) {
            .header, .sidebar, .content, .footer {
                flex-direction: column;
            }
            .sidebar {
                height: auto;
            }
            .content {
                height: auto;
            }
            .footer {
                position: relative;
            }
        }
    </style>
</head>
<body>

<div class="header">
    <h2>Pet Paradise</h2>
    <div class="header-right">
        <input type="text" placeholder="Search..." class="search-bar">
        <a href="Checkout.html"><img src="Pictures/Car.png" alt="Car" class="car-icon"></a>
        <a href="login.jsp">Login</a> | <a href="Create.html">Sign Up</a>
    </div>
</div>


<div style="display: flex;">
    <div class="sidebar">
        <a href="Index.html">Home</a>
        <a href="dogs.html">Dogs</a>
        <a href="cats.html">Cats</a>
        <a href="birds.html">Birds</a>
        <a href="fishes.html">Fishes</a>
        <a href="AboutUs.html">AboutUs</a>
        <a href="contact.html">Contact</a>
        <a href="trackorder.html">Track Order</a>
    </div>

    <div id="content">
        <div class="content-section">
            <div>Dogs are highly social, domesticated mammals known for their loyalty, versatility, and companionship. As descendants of wolves, they were among the first animals to be domesticated by humans more than 15,000 years ago. Today, dogs are valued not only for their ability to perform various tasks, including herding, hunting, protection, and assistance, but also for their unwavering companionship and capacity to enhance the lives of their human counterparts.
                <br>
                <br>
                Special Skills:
                <br>
                <li>Companionship: </li>Dogs are renowned for their loyalty and companionship, providing unconditional love and support to their owners.
                <br>
                <li>Assistance and Service: </li>Trained dogs can perform a wide range of services, including guiding the visually impaired, assisting people with disabilities, detecting medical conditions, and providing therapy and emotional support.
                <br>
                <li>Protection: </li>Dogs have a natural instinct to protect their pack, making them excellent protectors of their homes and families.
                <br>
                <li>Highly Trainable: </li>Dogs' desire to please their owners, combined with their intelligence, makes them highly trainable for various tasks, tricks, and behaviors.
                <br>
                <li>Social and Active: </li>Dogs often encourage outdoor activities and socialization, promoting a healthy lifestyle for their owners.</div>
            <img src="Pictures/Dog.png" alt="Image">
        </div>

        <div class="content-section" style="flex-direction: row-reverse;">
            <div>Cats are small, carnivorous mammals known for their agility, grace, and independence. They have been domesticated by humans for thousands of years, originally valued for their prowess in hunting and controlling pests. Today, they are cherished as companions for their unique personalities, comforting presence, and the joy they bring to their human counterparts.
                <br>
                <br>
                Special Skills:
                <br>
                <li>Pest Control: </li>Cats are natural hunters and can help keep the population of rodents and pests at bay in a household environment.
                <br>
                <li>Self-Cleaning: </li>Cats are meticulously clean animals, spending a significant portion of their day grooming themselves. This behavior reduces the need for regular baths and helps keep their coat healthy and free of parasites.
                <br>
                <li>Low Maintenance: </li>Compared to many other pets, cats require relatively less daily care and attention. They are independent creatures that can entertain themselves and do not require daily walks outside.
                <br>
                <li>Emotional Support: </li>Cats are known for their ability to provide emotional support and companionship. Their presence can reduce stress, anxiety, and loneliness in their human companions.
                <br>
                <li>Adaptability: </li>Cats can thrive in various environments, from spacious country homes to compact city apartments, making them suitable pets for a wide range of living situations.</div>
            <img src="Pictures/cat.png" alt="Image">
        </div>

        <div class="content-section">
            <div>Domestic birds encompass a wide range of bird species that have been kept as pets or for production purposes. These include parrots, canaries, finches, and pigeons, among others. Birds are admired for their vibrant colors, melodious songs, and the ability to mimic human speech, especially in the case of parrots. They offer a unique kind of companionship through their lively personalities and interactive behaviors, making them fascinating pets for bird enthusiasts and animal lovers alike.
                <br>
                <br>
                Special Skills:
                <br>
                <li>Vocal Abilities: </li>Many bird species, particularly parrots, are known for their ability to mimic human speech and other sounds, which can provide entertainment and companionship to their owners.
                <br>
                <li>Colorful and Aesthetic Appeal: </li>Birds come in a dazzling array of colors and patterns, adding visual beauty to any environment.
                <br>
                <li>Intellect: </li>Birds, especially parrots, are highly intelligent and capable of solving complex problems, which can be nurtured through interactive play and training.
                <br>
                <li>Social Interaction: </li>Birds often form strong bonds with their owners and require social interaction, which can help reduce feelings of loneliness and isolation.
                <br>
                <li>Longevity: </li>Many bird species have long lifespans, providing companionship for many years, with some parrots living up to 50 years or more.</div>
            <img src="Pictures/Birds.png" alt="Image">
        </div>

        <div class="content-section" style="flex-direction: row-reverse;">
            <div>Domestic fish encompass a diverse group of aquatic species kept in home aquariums or ponds for decoration, hobby, or companionship purposes. Popular among these are tropical fish like the Neon Tetra, Angelfish, and Betta, as well as freshwater species such as Goldfish and Guppies. Fishkeeping appeals to those fascinated by the underwater world, offering a slice of aquatic life that can be both calming and mesmerizing to observe.
                <br>
                <br>
                Special Skills:
                <br>
                <li>Aesthetic Appeal: </li>Fish come in a variety of shapes, colors, and sizes, adding visual interest and beauty to any space.
                <br>
                <li>Stress Reduction: </li>Watching fish swim gracefully in their aquatic environment is known to have a calming effect, reducing stress and anxiety in observers.
                <br>
                <li>Educational Value: </li>Maintaining an aquarium provides educational insights into aquatic ecosystems, water chemistry, and the biology of different fish species.
                <br>
                <li>Minimal Space Requirements: </li>Fish are suitable pets for people with limited space, as they can be accommodated in small apartments or offices.
                <br>
                <li>Diverse Ecosystems: </li>Advanced hobbyists can create complex aquatic ecosystems, such as reef aquariums, that support not only fish but also live plants, corals, and invertebrates.</div>
            <img src="Pictures/Fishes.png" alt="Image">
        </div>
    </div>
</div>
</body>
</html>