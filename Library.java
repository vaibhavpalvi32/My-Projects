package Books;
import java.util.Scanner;
import java.util.InputMismatchException;

interface payment
{
	public void getDetails();
}

class Books implements payment
{
	String Book_Name;
	String Book_Author_Name;
	String Book_Genre;
	String Book_Released_Date;
	double Book_Price;
	
	private String Book_owner_name;
	private String Book_owner_Mobile_no;
	private String Book_owner_EmailId;
	
	public void setBook_owner_name(String Book_owner_name)
	{
		this.Book_owner_name=Book_owner_name;
	}
	public String getBook_owner_name()
	{
		return Book_owner_name;
	}
	public void setBook_owner_Mobile_no(String Book_owner_Mobile_no)
	{
		this.Book_owner_Mobile_no=Book_owner_Mobile_no;
	}
	public String getBook_owner_Mobile_no()
	{
		return Book_owner_Mobile_no;
	}
	public void setBook_owner_EmailId(String Book_owner_EmailId)
	{
		this.Book_owner_EmailId=Book_owner_EmailId;
	}
	public String getBook_owner_EmailId()
	{
		return Book_owner_EmailId;
	}
	public void pass(String Book_Name,String Book_Author_Name,String Book_Genre,String Book_Released_Date,double Book_Price)
	{
		this.Book_Name=Book_Name;
		this.Book_Author_Name=Book_Author_Name;
		this.Book_Genre=Book_Genre;
		this.Book_Released_Date=Book_Released_Date;
		this.Book_Price=Book_Price;
	}
	@Override
	public void getDetails()
	{
		System.out.println("Book Name :                "+Book_Name);
		System.out.println("Book Author Name :         "+Book_Author_Name);
		System.out.println("Book Genre :               "+Book_Genre);
		System.out.println("Book Released Date :       "+Book_Released_Date);
		System.out.println("Book Price :               "+Book_Price);
		System.out.println("Book owner Name :          "+Book_owner_name);
		System.out.println("Book owner Mobile no :     "+Book_owner_Mobile_no);
		System.out.println("Book owner Email Id :      "+Book_owner_EmailId);
	}
	
	public void Howtoreadbooks()
	{
		
	}
	public void whyreadbooks()
	{
		
	}
}
class Fictional extends Books
{
	@SuppressWarnings({ "unused", "resource" })
	public void FIC()
	{
		Books B1=new Fantasy();
		Fantasy fan=(Fantasy)B1;
		
		Books B2=new Horror();
		Horror hor=(Horror)B2;
		
		Books B3=new Mystery();
		Mystery mys=(Mystery)B3;
		
		Books B4=new Romance();
		Romance rom=(Romance)B4;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 For Fanatcy Books :");
		System.out.println("Enter 2 For Horror Books :");
		System.out.println("Enter 3 For Mystery Books :");
		System.out.println("Enter 4 For Romance Books :");
	
		
		int opt=sc.nextInt();
		
		switch (opt) {
		case 1: 
		{
			System.out.println("You Choosen Fantacy Books :");
			fan.FAN();
		}
		case 2: 
		 {
			System.out.println("You Choosen Horror Books :");
			hor.HOR();
		 }
		case 3: 
		 {
			System.out.println("You Choosen Mystery Books :");
			mys.MYS();
		 }
		case 4: 
		 {
			System.out.println("You Choosen Romance Books :");
			rom.ROM();
		 }

		default:
			System.out.println("Invalid Input");
		}
	}
}
class Fantasy extends Fictional
{
	@SuppressWarnings("resource")
	public void FAN()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 For The Arabian Nights");
		System.out.println("Enter 2 For Le Morte d' Arthur");
		System.out.println("Enter 3 For The Alices's Adventure In Wonderland");
		System.out.println("Enter 4 For Through The Looking Glass");
		System.out.println("Enter 5 For Five Children And It");
		System.out.println("Enter 6 For Mary Poppins");
		System.out.println("Enter 7 For The Lion The Witch And The Wardrobe");
		System.out.println("Enter 8 For The Palm Wine Drinkard");
		System.out.println("Enter 9 For The Fellowship Of The Ring");
		System.out.println("Enter 10 For The Two Towers");
		System.out.println("Enter 11 For The Return of The King");
		System.out.println("Enter 12 A Hero Born");
		System.out.println("Enter 13 The Once And Future King");
		System.out.println("Enter 14 The Wandering Unicorn");
		System.out.println("Enter 15 DragonFlight");
		System.out.println("Enter 16 The Bloody Chamber");
		System.out.println("Enter 17 The Redwall");
		System.out.println("Enter 18 Harry Potter And The Half Blood Prince");
		System.out.println("Enter 19 The Hundred Thousand Kingdoms");
		System.out.println("Enter 20 Angelfall");
		
		int opt =sc.nextInt();
		switch (opt) 
		{
		case 1: 
		{
				System.out.println("Thank you for choosing The Arabian Nights");
				System.out.println("Description : Nearly everyone is familiar with this collection of folktales, also known as One Thousand and One Nights, and its infamous framing device: Scheherazade, the vizier’s daughter, is set to be married and then killed by the king.she forestalls this destiny by convincing the king to hear a story, which she then draws out for 1,001 nights by ending each evening on a cliffhanger In other words, Scheherazade invented narrative television. It’s hard to ignore that, from the start, this book of short stories is deeply misogynistic; the problematic gender dynamics of its time are pervasive and often stomach churning");
				System.out.println();
				d.finalDetails("The Arabian Nights ","Anomymous","1932","Fantasy",500.0);
				break;
				
		}
		case 2:
		{
			System.out.println("Thank you for choosing Le Morte d' Arthur");
			System.out.println("Description : One of the earliest printed works of the fantasy genre can be found in the 15th century’s Le Morte d’Arthur, French for the death of Arthur The book, published in 1485 by Sir Thomas Malory (whose authorship remains disputed), is a collection of stories, myths and folklore surrounding the exploits of King Arthur, who supposedly defended Britain from Saxon invaders in the 5th or 6th century C.E These stories, which are retellings, reimaginings or consolidations of oral tradition and disparate epic poems, contain classic tales including Arthur receiving Excalibur from the Lady of the Lake and the Knights of the Round Table’s search for the Holy Grail.");
			System.out.println();
			d.finalDetails("Le Morte d' Arthur","Sir Thomas Malory","1485","Fantasy",650.0);
			break;
		}
		case 3:
		{
			System.out.println("Thank you for choosing Alice's Adventure In Wonderland");
			System.out.println("Description : After a tumble down the rabbit hole, Alice finds herself far away from home in the absurd world of Wonderland. As mind-bending as it is delightful, Lewis Carroll's 1865 novel is pure magic for young and old alike.");
			System.out.println();
			d.finalDetails("Alice's Adventure In Wonderland","Lewis Carroll","1865","Fantasy",550.0);
			break;
		}
		case 4:
		{
			System.out.println("Thank you for choosing Through The Looking Glass");
			System.out.println("Description : Through the Looking-Glass, and What Alice Found There (also known as Alice Through the Looking-Glass or simply Through the Looking-Glass) is a novel published on 27 December 1871 by Lewis Carroll and the sequel to Alice's Adventures in Wonderland (1865). Alice again enters a fantastical world, this time by climbing through a mirror into the world that she can see beyond it. There she finds that, just like a reflection, everything is reversed, including logic (for example, running helps one remain stationary, walking away from something brings one towards it, chessmen are alive, nursery rhyme characters exist, and so on).");
			System.out.println();
			d.finalDetails("Through The Looking Glass","Lewis Carroll","17-December-1871","Fantasy",650.0);
			break;
		}
		case 5:
		{
			System.out.println("Thank you for choosing Through The Looking Glass");
			System.out.println("Description : The five children find a cantankerous sand fairy, a psammead, in a gravel pit. Every day 'It' will grant each of them a wish that lasts until sunset, often with disastrous consequences. Never out of print since 1902. The Introduction to this edition examines Nesbit's life and her reading, showing the change in childrens' literature from Victorian times.");
			System.out.println();
			d.finalDetails("Five Children And It","E.Nesbit","1902","Fantasy",700.0);
			break;
		}
		case 6:
		{
			System.out.println("Thank you for choosing Mary Poppins");
			System.out.println("Description : Mary Poppins is a series of eight children's books written by Australian-British writer P. L. Travers and published over the period 1934 to 1988. Mary Shepard was the illustrator throughout the series.The books centre on the magical English nanny Mary Poppins, who is blown by the East wind to Number 17 Cherry Tree Lane, London, and into the Banks' household to care for their children. Encounters with pavement-painters and shopkeepers, and various adventures ensue, until Mary Poppins abruptly leaves. Only the first three of the eight books feature Mary Poppins arriving and leaving. The later five books recount previously unrecorded adventures from her original three visits. As Travers explains in her introduction to Mary Poppins in the Park, \"She cannot forever arrive and depart.");
			System.out.println();
			d.finalDetails("Mary Poppins","P.L. Travers","1934-1988","Fantasy",800.0);
			break;
		}
		case 7:
		{
			System.out.println("Thank you for choosing The Lion, The Withch And The Wardrobe");
			System.out.println("Description : The Lion, the Witch and the Wardrobe is a fantasy novel for children by C. S. Lewis, published by Geoffrey Bles in 1950. It is the first published and best known of seven novels in The Chronicles of Narnia (1950–1956). Among all the author's books, it is also the most widely held in libraries. Although it was originally the first of The Chronicles of Narnia, it is volume two in recent editions that are sequenced by the stories' chronology. Like the other Chronicles, it was illustrated by Pauline Baynes, and her work has been retained in many later editions.");
			System.out.println();
			d.finalDetails("The Lion, The Withch And The Wardrobe","C.S. Lewis","1950","Fantasy",1000.0);
			break;
		}
		case 8:
		{
			System.out.println("Thank you for choosing The Palm Wine Drinkard");
			System.out.println("Description : When Amos Tutuola's first novel, The Palm-Wine Drinkard, appeared in 1952, it aroused exceptional worldwide interest. Drawing on the West African (Nigeria) Yoruba oral folktale tradition, Tutuola described the odyssey of a devoted palm-wine drinker through a nightmare of fantastic adventure. Since then, The Palm-Wine Drinkard has been translated into more than 15 languages and has come to be regarded as a masterwork of one of Africa's most influential writers.");
			System.out.println();
			d.finalDetails("The Palm Wine Drinkard","Amos Tutuola","1952","Fantasy",750.0);
			break;
		}
		case 9:
		{
			System.out.println("Thank you for choosing The Fellowship Of The Ring");
			System.out.println("Description : One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkeness bind them. In ancient times the Rings of Power were crafted by the Elven-smiths, and Sauron, The Dark Lord, forged the One Ring, filling it with his own power so that he could rule all others. But the One Ring was taken from him, and though he sought it throughout Middle-earth, it remained lost to him. After many ages it fell into the hands of Bilbo Baggins, as told in The Hobbit. In a sleepy village in the Shire, young Frodo Baggins finds himself faced with an immense task, as his elderly cousin Bilbo entrusts the Ring to his care. Frodo must leave his home and make a perilous journey across Middle-earth to the Cracks of Doom, there to destroy the Ring and foil the Dark Lord in his evil purpose.");
			System.out.println();
			d.finalDetails("The Fellowship Of The Ring","J.R.R. Tolkien","29-July-1954","Fantasy",1100.0);
			break;
		}
		case 10:
		{
			System.out.println("Thank you for choosing The Two Towers");
			System.out.println("Description : Begin your journey into Middle-earth. The inspiration for the upcoming original series on Prime Video, The Lord of the Rings: The Rings of Power. The Two Towers is the second part of J.R.R. Tolkien’s epic adventure The Lord of the Rings. One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them. Frodo and his Companions of the Ring have been beset by danger during their quest to prevent the Ruling Ring from falling into the hands of the Dark Lord by destroying it in the Cracks of Doom. They have lost the wizard, Gandalf, in a battle in the Mines of Moria. And Boromir, seduced by the power of the Ring, tried to seize it by force. While Frodo and Sam made their escape, the rest of the company was attacked by Orcs. Now they continue the journey alone down the great River Anduin—alone, that is, save for the mysterious creeping figure that follows wherever they go.");
			System.out.println();
			d.finalDetails("The Two Towers","J.R.R. Tolkien","11-November-1954","Fantasy",1150.0);
			break;
		}
		case 11:
		{
			System.out.println("Thank you for choosing The Return Of The King");
			System.out.println("Description : Begin your journey into Middle-earth. The inspiration for the upcoming original series on Prime Video, The Lord of the Rings: The Rings of Power. The Return of the King is the third part of J.R.R. Tolkien’s epic adventure The Lord of the Rings.One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them. The Dark Lord has risen, and as he unleashes hordes of Orcs to conquer all Middle-earth, Frodo and Sam struggle deep into his realm in Mordor. To defeat Sauron, the One Ring must be destroyed in the fires of Mount Doom. But the way is impossibly hard, and Frodo is weakening. The Ring corrupts all who bear it and Frodo’s time is running out. Will Sam and Frodo succeed, or will the Dark Lord rule Middle-earth once more?");
			System.out.println();
			d.finalDetails("The Return Of The King","J.R.R. Tolkien","20-October-1955","Fantasy",1200.0);
			break;
		}
		case 12:
		{
			System.out.println("Thank you for choosing A Hero Born");
			System.out.println("Description : The Song Empire has been invaded by its warlike Jurchen neighbours from the north. Half its territory and its historic capital lie in enemy hands; the peasants toil under the burden of the annual tribute demanded by the victors. Meanwhile, on the Mongolian steppe, a disparate nation of great warriors is about to be united by a warlord whose name will endure for eternity: Genghis Khan. Guo Jing, son of a murdered Song patriot, grew up with Genghis Khan's army. He is humble, loyal, perhaps not altogether wise, and is fated from birth to one day confront an opponent who is the opposite of him in every way: privileged, cunning and flawlessly trained in the martial arts. Guided by his faithful shifus, The Seven Heroes of the South, Guo Jing must return to China - to the Garden of the Drunken Immortals in Jiaxing - to fulfil his destiny. But in a divided land riven by war and betrayal, his courage and his loyalties will be tested at every turn. ");
			System.out.println();
			d.finalDetails("A Hero Born","Jin Yong","1-January-1957 to 19-May-1959","Fantasy",550.0);
			break;
		}
		case 13:
		{
			System.out.println("Thank you for choosing The Once And Future King");
			System.out.println("Description : T.H White′s masterful retelling of the Arthurian legend is an abiding classic. Here all five volumes that make up the story are published in one volume, as White himself always wished. Exquisite comedy offsets the tragedy of Arthur′s personal doom as White brings to life the major British epic of all time with brilliance, grandeur, warmth and charm.");
			System.out.println();
			d.finalDetails("The Once And Future King","T. H. White","1958","Fantasy",950.0);
			break;
		}
		case 14:
		{
			System.out.println("Thank you for choosing The Wandering Unicorn");
			System.out.println("Description : The inspiration for this enthralling mediaeval romance is an ancient legend: condemned by the chicanery of her wicked mother to spend centuries languishing invisibly in her belfry, the beautiful Melusine is an immortal outcast, half woman, half serpent.");
			System.out.println();
			d.finalDetails("The Wandering Unicorn"," Manuel Mujica Láinez ","1965","Fantasy",850.0);
			break;
		}
		case 15:
		{
			System.out.println("Thank you for choosing Dragonflight");
			System.out.println("Description : To the nobles who live in Benden Weyr, Lessa is nothing but a ragged kitchen girl. For most of her life she has survived by serving those who betrayed her father and took over his lands. Now the time has come for Lessa to shed her disguise—and take back her stolen birthright.But everything changes when she meets a queen dragon. The bond they share will be deep and last forever. It will protect them when, for the first time in centuries, Lessa’s world is threatened by Thread, an evil substance that falls like rain and destroys everything it touches. Dragons and their Riders once protected the planet from Thread, but there are very few of them left these days. Now brave Lessa must risk her life, and the life of her beloved dragon, to save her beautiful world. . . . ");
			System.out.println();
			d.finalDetails("Dragonflight","Anne McCaffrey","July 1968","Fantasy",900.0);
			break;
		}
		case 16:
		{
			System.out.println("Thank you for choosing The Bloody Chamber");
			System.out.println("Description : Angela Carter was a storytelling sorceress, the literary godmother of Neil Gaiman, David Mitchell, Audrey Niffenegger, J. K. Rowling, Kelly Link, and other contemporary masters of supernatural fiction. In her masterpiece, The Bloody Chamber—which includes the story that is the basis of Neil Jordan’s 1984 movie The Company of Wolves—she spins subversively dark and sensual versions of familiar fairy tales and legends like “Little Red Riding Hood,” “Bluebeard,” “Puss in Boots,” and Beauty and the Beast. giving them exhilarating new life in a style steeped in the romantic trappings of the gothic tradition.");
			System.out.println();
			d.finalDetails("The Bloody Chamber","Angela Carter","1979","Fantasy",800.0);
			break;
		}
		case 17:
		{
			System.out.println("Thank you for choosing Redwall");
			System.out.println("Description : Redwall Abbey, tranquil home to a community of peace-loving mice, is threatened by Cluny the Scourge savage bilge rat warlord and his battle-hardened horde. But the Redwall mice and their loyal woodland friends combine their courage and strength.");
			System.out.println();
			d.finalDetails("Redwall","Brian Jacques","Unknown","Fantasy",750.0);
			break;
		}
		case 18:
		{
			System.out.println("Thank you for choosing Harry Potter And The Halfblood Prince");
			System.out.println("Description : It is the middle of the summer, but there is an unseasonal mist pressing against the windowpanes. Harry Potter is waiting nervously in his bedroom at the Dursleys' house in Privet Drive for a visit from Professor Dumbledore himself. One of the last times he saw the Headmaster was in a fierce one-to-one duel with Lord Voldemort, and Harry can't quite believe that Professor Dumbledore will actually appear at the Dursleys' of all places. Why is the Professor coming to visit him now? What is it that cannot wait until Harry returns to Hogwarts in a few weeks' time? Harry's sixth year at Hogwarts has already got off to an unusual start, as the worlds of Muggle and magic start to intertwine...");
			System.out.println();
			d.finalDetails("Harry Potter And The Halfblood Prince","J.K. Rowling","16-July-2005","Fantasy",950.0);
			break;
		}
		case 19:
		{
			System.out.println("Thank you for choosing The Hundred Thousand Kingdoms");
			System.out.println("Description : Yeine Darr is an outcast from the barbarian north. But when her mother dies under mysterious circumstances, she is summoned to the majestic city of Sky. There, to her shock, Yeine is named an heiress to the king. But the throne of the Hundred Thousand Kingdoms is not easily won, and Yeine is thrust into a vicious power struggle.");
			System.out.println();
			d.finalDetails("The Hundred Thousand Kingdoms","N. K. Jemisin","25-February-2010","Fantasy",1000.0);
			break;
		}
		case 20:
		{
			System.out.println("Thank you for choosing Angelfall");
			System.out.println("Description : It's been six weeks since angels of the apocalypse descended to demolish the modern world. Street gangs rule the day while fear and superstition rule the night. When warrior angels fly away with a helpless little girl, her seventeen-year-old sister Penryn will do anything to get her back.");
			System.out.println();
			d.finalDetails("Angelfall","Susan Ee","May 21st, 2011","Fantasy",500.0);
			break;
		}
		default:
			System.out.println("Invalid Input");
			System.out.println();
		}
	}
}
class Horror extends Fictional
{
	@SuppressWarnings("resource")
	public void HOR()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For The Nightmare Girl");
		System.out.println("Enter 2 For The Bone Weavers Orchard");
		System.out.println("Enter 3 For The Dead House");
		System.out.println("Enter 4 For When Michael Calls");
		System.out.println("Enter 5 For Scream Queen");
		System.out.println("Enter 6 For The Worst Is Yet to Come");
		System.out.println("Enter 7 For Lady Bits");
		System.out.println("Enter 8 For If It Bleeds");
		System.out.println("Enter 9 For Garden of Eldritch Delights");
		System.out.println("Enter 10 For Dracula");
		System.out.println("Enter 11 For Rebecca");
		System.out.println("Enter 12 For I Am Legend");
		System.out.println("Enter 13 For The Devil Inside");
		System.out.println("Enter 14 For A God of Hungry Walls");
		System.out.println("Enter 15 For The Garden of Blue Roses");
		System.out.println("Enter 16 For My Eyes Are Black Holes");
		System.out.println("Enter 17 For Parasite");
		System.out.println("Enter 18 For Annihilation");
		System.out.println("Enter 19 For Gideon The Ninth");
		System.out.println("Enter 20 For Headcheese");
		
		int opt =sc.nextInt();
		
		switch (opt) 
		{
		case 1: 
		{
			    System.out.println("Thank you for choosing The Nightmare Girl");
			    System.out.println("Description : When family man Joe Crawford confronts a young mother abusing her toddler, he has no idea of the chain reaction he's setting in motion. How could he suspect the young mother is part of an ancient fire cult, a sinister group of killers that will destroy anyone who threatens one of its members? When the little boy is placed in a foster home, the fanatics begin their mission of terror. Soon the cult leaders will summon their deadliest hunters-and a ferocious supernatural evil-to make Joe pay for what he's done. They want Joe's blood and the blood of his family. And they want their child back. ");
			    System.out.println();
			    d.finalDetails("The Nightmare Girl","Jonathan Janz ","Unknown","Horror",560.0);
				break;
		}
		case 2:
		{
			System.out.println("Thank you for choosing The Bone Weavers Orchard");
			System.out.println("Description : He’s run away home. That’s what they say every time one of Charley Winslow’s friends vanishes from The Old Cross School for Boys. It’s just a tall tale. That’s what they tell Charley when he sees the ragged grey figure stalking the abbey halls at night. When Charley follows his pet insects to a pool of blood behind a false wall, he could run and let those stones bury their secrets. He could assimilate, focus on his studies, and wait for his father to send for him. Or he could walk the dark tunnels of the school’s heart, scour its abandoned passages, and pick at the scab of a family’s legacy of madness and murder. With the help of Sam Forster, the school’s gardener, and Matron Grace, the staff nurse, Charley unravels Old Cross’ history and exposes a scandal stretching back to when the school was a home with a noble family and a dark secret—a secret that still haunts its halls with scraping steps, twisting its bones into a new generation of nightmares.");
			System.out.println();
			d.finalDetails("The Bone Weavers Orchard","Sarah Read","2019","Horror",660.0);
			break;

		}
		case 3:
		{
			System.out.println("Thank you for choosing The Dead House");
			System.out.println("Description : Twenty-five years ago, Elmbridge High burned down. Three people were killed and one pupil, Carly Johnson, disappeared. Now a diary has been found in the ruins of the school. The diary belongs to Kaitlyn Johnson, Carly’s identical twin sister. But Carly didn’t have a twin . . .");
			System.out.println();
			d.finalDetails("The Dead House","Dawn Kurtagich","6-August-2015","Horror",560.0);
			break;

		}
		case 4:
		{
			System.out.println("Thank you for choosing When Michael Calls");
			System.out.println("Description : ");
			System.out.println();
			d.finalDetails("When Michael Calls","John Farris","1967","Horror",770.0);
			break;

		}
		case 5:
		{
			System.out.println("Thank you for choosing Scream Queen");
			System.out.println("Description : The setting is perfect, a crumbling Victorian mansion with a gruesome history and a former owner who turned out to be a serial killer. Throw in a few buckets of fake blood, a bunch of rubber body parts, and a cast of aspiring actors who’ll do anything for a close-up. An expert parapsychologist even warns the production team against disturbing the house’s dormant spirits. Fantastic publicity. Sure, the budget’s low, but the ratings are going to soar. ");
			System.out.println();
			d.finalDetails("Scream Queen","Edo Van Belkom","Unknown","Horror",850.0);
			break;

		}
		case 6:
		{
			System.out.println("Thank you for choosing The Worst Is Yet to Come");
			System.out.println("Description : For most of her fourteen years, Tasha Davis has languished in the rural-suburban town of Skillute, Washington. Her parents offer plenty of comfortable—if stifling—emotional support, but what she needs is a best friend. In her final year at Clark Middle School, Tasha meets a strange, new classmate. Briar Kenny is the self-styled rebel Tasha wants to be, and the Davises are the kind of close-knit family Briar covets. A moment of unexpected violence spawns a secret between the two girls and awakens a mystery from the past. Unknown to Tasha and Briar, their secret also attracts something monstrous from a forgotten corner of Skillute. The town is haunted by its history, scarred with the lingering spirit of broken and scattered families, abandoned real estate ventures, and old scores never settled between neighbors. But there’s more to the place than memory and legend. Beneath the landscape something malignant rages, and it will stop at nothing to find a route into the physical world.");
			System.out.println();
			d.finalDetails("The Worst Is Yet to Come","S.P. Miskowski","22-February-2019","Horror",1000.0);
			break;

		}
		case 7:
		{
			System.out.println("Thank you for choosing Lady Bits");
			System.out.println("Description : A troubled mother commits an unspeakable act to banish the demon that lurks in her root cellar. Ghosts from the past won’t release their hold on a young woman. A girl in search of a new job as a nanny finds herself in charge of a mysterious package that requires much more care than any child. Lady Bits collects sixteen tales from Bram Stoker and Shirley Jackson award nominated author Kate Jonez that explores the horror nestled in the female heart. Vividly realized protagonists engage with an often-hostile world to deliver justice, lower a vengeance hammer, or to simply revel in evil. Prepare to be unsettled, disturbed, and terrified.");
			System.out.println();
			d.finalDetails("Lady Bits","Kate Jonez","March 2019","Horror",456.0);
			break;

		}
		case 8:
		{
			System.out.println("Thank you for choosing If It Bleeds");
			System.out.println("Description : A collection of four uniquely wonderful long stories, including a stand-alone sequel to The Outsider.");
			System.out.println();
			d.finalDetails("If It Bleeds","Stephen King","Unknown","Horror",760.0);
			break;

		}
		case 9:
		{
			System.out.println("Thank you for choosing For Garden of Eldritch Delights");
			System.out.println("Description : ");
			System.out.println();
			d.finalDetails("For Garden of Eldritch Delights","Lucy A. Snyder","Unknown","Horror",789.0);
			break;

		}
		case 10:
		{
			System.out.println("Thank you for choosing Dracula");
			System.out.println("Description : When Jonathan Harker visits Transylvania to help Count Dracula with the purchase of a London house, he makes a series of horrific discoveries about his client. Soon afterwards, various bizarre incidents unfold in England: an apparently unmanned ship is wrecked off the coast of Whitby; a young woman discovers strange puncture marks on her neck; and the inmate of a lunatic asylum raves about the 'Master' and his imminent arrival.");
			System.out.println();
			d.finalDetails("Dracula","Bram Stoker","12-May-1986","Horror",780.0);
			break;

		}
		case 11:
		{
			System.out.println("Thank you for choosing Rebecca");
			System.out.println("Description : \"Last night I dreamt I went to Manderley again...\"Ancient, beautiful Manderley, between the rose garden and the sea, is the county's showpiece. Rebecca made it so - even a year after her death, Rebecca's influence still rules there. How can Maxim de Winter's shy new bride ever fill her place or escape her vital shadow? A shadow that grows longer and darker as the brief summer fades, until, in a moment of climatic revelations, it threatens to eclipse Manderley and its inhabitants completely... ");
			System.out.println();
			d.finalDetails("Rebecca","Daphne du Maurier","17-December-2013","Horror",950.0);
			break;

		}
		case 12:
		{
			System.out.println("Thank you for choosing I Am Legend");
			System.out.println("Description : Robert Neville is the last living man on Earth... but he is not alone. Every other man, woman and child on the planet has become a vampire, and they are hungry for Neville's blood. By day he is the hunter, stalking the undead through the ruins of civilisation. By night, he barricades himself in his home and prays for the dawn. How long can one man survive like this?");
			System.out.println();
			d.finalDetails("I Am Legend","Richard Matheson","14-May-2011","Horror",1100.0);
			break;

		}
		case 13:
		{
			System.out.println("Thank you for choosing The Devil Inside");
			System.out.println("Description : No Description");
			System.out.println();
			d.finalDetails("The Devil Inside","Susan K. Hamilton","Unknown","Horror",460.0);
			break;

		}
		case 14:
		{
			System.out.println("Thank you for choosing A God of Hungry Walls");
			System.out.println("Description : From Wonderland Book Award winning author, Garrett Cook, comes a haunted house novel unlike any you've ever read. Told entirely from the perspective of the haunting, A GOD OF HUNGRY WALLS is a perverse, violent, and soul-crushing take on supernatural horror.");
			System.out.println();
			d.finalDetails("A God of Hungry Walls","Garrett Cook","23-September-2015","Horror",660.0);
			break;

		}
		case 15:
		{
			System.out.println("Thank you for choosing The Garden of Blue Roses");
			System.out.println("Description : A car lies at the bottom of an icy ravine. Slumped over the steering wheel, dead, is the most critically acclaimed horror writer of his time. Was it an accident? His son Milo doesn't care. For the first time in his life, he's free. No more nightmarish readings, spooky animal rites, or moonlit visions of his father in the woods with a notebook and vampire make-up.");
			System.out.println();
			d.finalDetails("The Garden of Blue Roses","Michael Barsa","17-April-2017","Horror",560.0);
			break;

		}
		case 16:
		{
			System.out.println("Thank you for choosing My Eyes Are Black Holes");
			System.out.println("Description : MY EYES ARE BLACK HOLES is a book of madness, drawing the reader into its sticky web of tangled logic, false memory, hallucination, and violence. This is a tale that leaves readers with questions and tests perspective in ways similar to a David Lynch film. Questions create mystery. Mystery creates madness. And madness is maddening.");
			System.out.println();
			d.finalDetails("My Eyes Are Black Holes","Logan Ryan Smith","18-May-2015","Horror",580.0);
			break;

		}
		case 17:
		{
			System.out.println("Thank you for choosing Parasite");
			System.out.println("Description : ");
			System.out.println();
			d.finalDetails("Parasite","Mira Grant","29-October-2013","Horror",560.0);
			break;

		}
		case 18:
		{
			System.out.println("Thank you for choosing Annihilation");
			System.out.println("Description : Area X has been cut off from the rest of the world for decades. Nature has reclaimed the last vestiges of human civilization. The first expedition returned with reports of a pristine, Edenic landscape; the second expedition ended in mass suicide, the third in a hail of gunfire as its members turned on one another. The members of the eleventh expedition returned as shadows of their former selves, and within weeks, all had died of cancer. In Annihilation, the first volume of Jeff VanderMeer's Southern Reach Trilogy, we join the twelfth expedition.");
			System.out.println();
			d.finalDetails("Annihilation","Jeff VanderMeer","4-February-2014","Horror",770.0);
			break;

		}
		case 19:
		{
			System.out.println("Thank you for choosing Gideon The Ninth");
			System.out.println("Description : Brought up by unfriendly, ossifying nuns, ancient retainers, and countless skeletons, Gideon is ready to abandon a life of servitude and an afterlife as a reanimated corpse. She packs up her sword, her shoes, and her dirty magazines, and prepares to launch her daring escape. But her childhood nemesis won't set her free without a service.");
			System.out.println();
			d.finalDetails("Gideon The Ninth","Tamsyn Muir","10-September-2019","Horror",990.0);
			break;

		}
		case 20:
		{
			System.out.println("Thank you for choosing Headcheese");
			System.out.println("Description : ");
			System.out.println();
			d.finalDetails("Headcheese"," Jess Hagemann ","18-December-2018","Horror",960.0);
			break;

		}
		default:
			System.out.println("Invalid Input");
			System.out.println();
		}
	}
}
class Mystery extends Fictional
{
	@SuppressWarnings({ "resource", "unused" })
	public void MYS()
	{
		@SuppressWarnings("unused")
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For The And Then Therer Were None");
		System.out.println("Enter 2 For The Big Sleep");
		System.out.println("Enter 3 For Gone Girl");
		System.out.println("Enter 4 For The Postman Always Rings Twice");
		System.out.println("Enter 5 For The Da Vinci");
		System.out.println("Enter 6 For In Cold Blood");
		System.out.println("Enter 7 For Women In White");
		System.out.println("Enter 8 For Anatomy Of a Murder");
		System.out.println("Enter 9 For Tinker,Tailor,Solider,Spy");
		System.out.println("Enter 10 For The Girl With Dragon Tattoo");
		
		int opt =sc.nextInt();
		
		switch (opt)
		{
			case 1:
			{
				System.out.println("Thank you for choosing And Then Therer Were None");
			    System.out.println("Description : First, there were ten—a curious assortment of strangers summoned as weekend guests to a little private island off the coast of Devon. Their host, an eccentric millionaire unknown to all of them, is nowhere to be found. All that the guests have in common is a wicked past they're unwilling to reveal—and a secret that will seal their fate. For each has been marked for murder. A famous nursery rhyme is framed and hung in every room of the mansion.");
			    System.out.println();
			    d.finalDetails("And Then Therer Were None","Agatha Christie","03-May-2004","Mystery",1100.0);
				break;
			}
			case 2:
			{
				System.out.println("Thank you for choosing The Big Sleep");
			    System.out.println("Description : This is the Code of the Private Eye as defined by Raymond Chandler in his 1944 essay The Simple Act of Murder. Such a man was Philip Marlowe, private eye, an educated, heroic, streetwise, rugged individualist and the hero of Chandler's first novel, The Big Sleep. This work established Chandler as the master of the 'hard-boiled' detective novel, and his articulate and literary style of writing won him a large audience, which ranged from the man in the street to the most sophisticated intellectual.");
			    System.out.println();
			    d.finalDetails("The Big Sleep","Raymond Chandler","12-July-1988","Mystery",567.0);
				break;
			}
			case 3:
			{
				System.out.println("Thank you for choosing Gone Girl");
			    System.out.println("Description : Who are you?\"What have we done to each other?. These are the questions Nick Dunne finds himself asking on the morning of his fifth wedding anniversary when his wife Amy suddenly disappears. The police suspect Nick. Amy's friends reveal that she was afraid of him, that she kept secrets from him. He swears it isn't true. A police examination of his computer shows strange searches. He says they weren't made by him. And then there are the persistent calls on his mobile phone.");
			    System.out.println();
			    d.finalDetails("Gone Girl","Gillian Flynn","02-April-2014","Mystery",660.0);
				break;
			}
			case 4:
			{
				System.out.println("Thank you for choosing The Postman Always Rings Twice");
			    System.out.println("Description : Cain's first novel - the subject of an obscenity trial in Boston and the inspiration for Camus's The Stranger - is the fever-pitched tale of a drifter who stumbles into a job, into an erotic obsession, and into a murder.");
			    System.out.println();
			    d.finalDetails("The Postman Always Rings Twice","James M. Cain","09-September-2010","Mystery",560.0);
				break;
			}
			case 5:
			{
				System.out.println("Thank you for choosing The Da Vinci");
			    System.out.println("Description : While in Paris, Harvard symbologist Robert Langdon is awakened by a phone call in the dead of the night. The elderly curator of the Louvre has been murdered inside the museum, his body covered in baffling symbols. As Langdon and gifted French cryptologist Sophie Neveu sort through the bizarre riddles, they are stunned to discover a trail of clues hidden in the works of Leonardo da Vinci—clues visible for all to see and yet ingeniously disguised by the painter.");
			    System.out.println();
			    d.finalDetails("The Da Vinci","Dan Brown","28-March-2006","Mystery",560.0);
				break;
			}
			case 6:
			{
				System.out.println("Thank you for choosing In Cold Blood");
			    System.out.println("Description : On November 15, 1959, in the small town of Holcomb, Kansas, four members of the Clutter family were savagely murdered by blasts from a shotgun held a few inches from their faces. There was no apparent motive for the crime, and there were almost no clues.");
			    System.out.println();
			    d.finalDetails("In Cold Blood","Truman Capote","1994","Mystery",585.0);
				break;
			}
			case 7:
			{
				System.out.println("Thank you for choosing Women In White");
			    System.out.println("Description : The Woman in White is an epistolary novel written by Wilkie Collins in 1859, serialized in 1859–1860, and first published in book form in 1860. It is considered to be among the first mystery novels and is widely regarded as one of the first (and finest) in the genre of 'sensation novels'.");
			    System.out.println();
			    d.finalDetails("Women In White","Wilkie Collins","26-December-2017","Mystery",630.0);
				break;
			}
			case 8:
			{
				System.out.println("Thank you for choosing Anatomy Of a Murder");
			    System.out.println("Description : First published by St. Martin's in 1958, Robert Traver's Anatomy of a Murder immediately became the number-one bestseller in America, and was subsequently turned into the successful and now classic Otto Preminger film. It is not only the most popular courtroom drama in American fiction, but one of the most popular novels of our time.");
			    System.out.println();
			    d.finalDetails("Anatomy Of a Murder","Robert Traver","15-March-1983","Mystery",560.0);
				break;
			}
			case 9:
			{
				System.out.println("Thank you for choosing Tinker,Tailor,Solider,Spy");
			    System.out.println("Description : Tinker Tailor Soldier Spy is a 1974 spy novel by British author John le Carré. It follows the endeavours of taciturn, aging spymaster George Smiley to uncover a Soviet mole in the British Secret Intelligence Service. The novel has received critical acclaim for its complex social commentary—and, at the time, relevance, following the defection of Kim Philby. The novel has been adapted into both a television series and a film, and remains a staple of the spy fiction genre.");
			    System.out.println();
			    d.finalDetails("Tinker,Tailor,Solider,Spy","John le Carré","June 1974","Mystery",760.0);
				break;
			}
			case 10:
			{
				System.out.println("Thank you for choosing The Girl With Dragon Tattoo");
			    System.out.println("Description : Harriet Vanger, a scion of one of Sweden’s wealthiest families disappeared over forty years ago. All these years later, her aged uncle continues to seek the truth. He hires Mikael Blomkvist, a crusading journalist recently trapped by a libel conviction, to investigate. He is aided by the pierced and tattooed punk prodigy Lisbeth Salander. Together they tap into a vein of unfathomable iniquity and astonishing corruption.");
			    System.out.println();
			    d.finalDetails("The Girl With Dragon Tattoo","Stieg Larsson","16-September-2008","Mystery",850.0);
				break;
			}
			default:
				System.out.println("Invalid Input");
				System.out.println();
			
		}
	}
}
class Romance extends Fictional
{
	public void ROM()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For The Pride And Prejudice");
		System.out.println("Enter 2 For The Fault In Our Stars");
		System.out.println("Enter 3 For Twilight");
		System.out.println("Enter 4 For The Hating Game");
		System.out.println("Enter 5 For Breaking Dawn");
		
		int opt =sc.nextInt();
		
		switch (opt)
		{
		case 1:
		{
			System.out.println("Thank you for choosing And The Pride And Prejudice");
		    System.out.println("Description : Pride and Prejudice is an 1813 novel of manners by Jane Austen. The novel follows the character development of Elizabeth Bennet, the dynamic protagonist of the book who learns about the repercussions of hasty judgments and comes to appreciate the difference between superficial goodness and actual goodness.");
		    System.out.println();
		    d.finalDetails("The Pride And Prejudice","Jane Austen","18-January-1813","Romance",1100.0);
			break;
		}
		case 2:
		{
			System.out.println("Thank you for choosing And The Fault In Our Stars");
		    System.out.println("Description : Despite the tumor-shrinking medical miracle that has bought her a few years, Hazel has never been anything but terminal, her final chapter inscribed upon diagnosis. But when a gorgeous plot twist named Augustus Waters suddenly appears at Cancer Kid Support Group, Hazel's story is about to be completely rewritten.");
		    System.out.println();
		    d.finalDetails("The Fault In Our Stars","John Green","10-January-2012","Romance",1200.0);
			break;
		}
		case 3:
		{
			System.out.println("Thank you for choosing And Twilight");
		    System.out.println("Description : About three things I was absolutely positive. First, Edward was a vampire. Second, there was a part of him—and I didn't know how dominant that part might be—that thirsted for my blood. And third, I was unconditionally and irrevocably in love with him. Deeply seductive and extraordinarily suspenseful, Twilight is a love story with bite. ");
		    System.out.println();
		    d.finalDetails("Twilight","Stephenie Meyer","05-October-2005","Romance",1500.0);
			break;
		}
		case 4:
		{
			System.out.println("Thank you for choosing And The Hating Game");
		    System.out.println("Description : Lucy Hutton and Joshua Templeman hate each other. Not dislike. Not begrudgingly tolerate. Hate. And they have no problem displaying their feelings through a series of ritualistic passive aggressive maneuvers as they sit across from each other, executive assistants to co-CEOs of a publishing company. Lucy can’t understand Joshua’s joyless, uptight, meticulous approach to his job. Joshua is clearly baffled by Lucy’s overly bright clothes, quirkiness, and Pollyanna attitude.");
		    System.out.println();
		    d.finalDetails("The Hating Game","Sally Thorne ","09-Auguat-2016","Romance",1100.0);
			break;
		}
		case 5:
		{
			System.out.println("Thank you for choosing And Breaking Dawn");
		    System.out.println("Description : THE ASTONISHING, BREATHLESSLY anticipated conclusion to the Twilight Saga, Breaking Dawn illuminates the secrets and mysteries of this spellbinding romantic epic that has entranced millions.");
		    System.out.println();
		    d.finalDetails("Breaking Dawn","Stephenie Meyer","02-August-2008","Romance",780.0);
			break;
		}

		}
		
	}
}
class Non_Fictional extends Books
{
	public void NfC()
	{
		Books B1=new Biography();
		Biography bg=(Biography)B1;
		
		Books B2=new AutoBiography();
		AutoBiography Abg=(AutoBiography)B2;
		
		Books B3=new History();
		History his=(History)B3;
		
		Books B4=new Memoirs();
		Memoirs mem=(Memoirs)B4;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 For Biography Books :");
		System.out.println("Enter 2 For Auto Biography Books :");
		System.out.println("Enter 3 For History Books :");
		System.out.println("Enter 4 For Academic Books :");
	
		
		int opt=sc.nextInt();
		
		switch (opt) 
		{
		case 1: 
		{
			System.out.println("You Choosen Biography Books :");
			bg.BG();
		}
		case 2: 
		 {
			System.out.println("You Choosen Auto Biography Books Books :");
			Abg.ABG();
		 }
		case 3: 
		 {
			System.out.println("You Choosen History Books :");
			his.HIS();
		 }
		case 4: 
		 {
			System.out.println("You Choosen Academic Books :");
			mem.MEM();
		 }

		default:
			System.out.println("Invalid Input");
		}
	}
}
class Biography extends Non_Fictional
{
	public void BG()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For A Beautiful Mind");
		System.out.println("Enter 2 For Alexander Hamilton");
		System.out.println("Enter 3 For Spy Princess");
		System.out.println("Enter 4 For E=mc²: A Biography of the World's Most Famous Equation");
		
		
		int opt =sc.nextInt();
		
		switch (opt)
		{
		case 1:
		{
			System.out.println("Thank you for choosing And A Beautiful Mind");
		    System.out.println("Description : Economist and journalist Sylvia Nasar has written a biography of Nash that looks at all sides of his life. She gives an intelligent, understandable exposition of his mathematical ideas and a picture of schizophrenia that is evocative but decidedly unromantic. Her story of the machinations behind Nash's Nobel is fascinating and one of very few such accounts available in print (the CIA could learn a thing or two from the Nobel committees).");
		    System.out.println();
		    d.finalDetails("A Beautiful Mind","Sylvia Nasar","04-February-2002","Biography",1100.0);
			break;
		}
		case 2:
		{
			System.out.println("Thank you for choosing And Alexander Hamilton");
		    System.out.println("Description : Pulitzer Prize-winning author Ron Chernow presents a landmark biography of Alexander Hamilton, the Founding Father who galvanized, inspired, scandalized, and shaped the newborn nation.");
		    System.out.println();
		    d.finalDetails("Alexander Hamilton","Ron Chernow","29-March-2005","Biography",1200.0);
			break;
		}
		case 3:
		{
			System.out.println("Thank you for choosing And Spy Princess");
		    System.out.println("Description : \"Spy Princess\" details Noor's inspiring life from birth to death, incorporating information from her family, friends, witnesses, and official records including recently released personal files of SOE operatives. It is the story of a young woman who lived with grace, beauty, courage and determination, and who bravely offered the ultimate sacrifice of her own life in service of her ideals. Her last word was \"Liberte\".");
		    System.out.println();
		    d.finalDetails("Spy Princess","hrabani Basu","08-February-2006","Biography",1000.0);
			break;
		}
		case 4:
		{
			System.out.println("Thank you for choosing And E=mc²: A Biography of the World's Most Famous Equation");
		    System.out.println("Description : Without sliding into easy psychobiography, Bodanis explores other circumstances as well; namely, Einstein's background and character, which combined with a sterling intelligence to afford him an idiosyncratic view of the way things work--a view that would change the world.");
		    System.out.println();
		    d.finalDetails("E=mc²: A Biography of the World's Most Famous Equation","David Bodanis ","18-January-1813","Biography",1100.0);
			break;
		}
		default:
			System.out.println("Invalid Input");
			System.out.println();
		
		}
	}
}
class AutoBiography extends Non_Fictional
{
	public void ABG()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For Wings of Fire");
		System.out.println("Enter 2 For Gandhi: An Autobiography");
		System.out.println("Enter 3 For Long Walk To Freedom");
		System.out.println("Enter 4 For I Am Malala: The Story of the Girl Who Stood Up for Education and Was Shot by the Taliban");
		
		int opt =sc.nextInt();
		
		switch (opt)
		{
		case 1:
		{
			System.out.println("Thank you for choosing Wings of Fire");
		    System.out.println("Description : Avul Pakir Jainulabdeen Abdul Kalam, the son of a little-educated boat-owner in Rameswaram, Tamil Nadu, had an unparalleled career as a defence scientist, culminating in the highest civilian award of India, the Bharat Ratna. As chief of the country's defence research and development programme, Kalam demonstrated the great potential for dynamism and innovation that existed in seemingly moribund research establishments. This is the story of Kalam's rise from obscurity and his personal and professional struggles, as well as the story of Agni, Prithvi, Akash, Trishul and Nag-missiles that have become household names in India and that have raised the nation to the level of a missile power of international reckoning. This is also the saga of independent India's struggle for technological self-sufficiency and defensive autonomy-a story as much about politics, domestic and international, as it is about science.");
		    System.out.println();
		    d.finalDetails("Wings of Fire","A.P.J. Abdul Kalam","11-January-2011","Auto-Biography",1100.0);
			break;
		}
		case 2:
		{
			System.out.println("Thank you for choosing Gandhi: An Autobiography");
		    System.out.println("Description : Mohandas K. Gandhi is one of the most inspiring figures of our time. In his classic autobiography he recounts the story of his life and how he developed his concept of active nonviolent resistance, which propelled the Indian struggle for independence and countless other nonviolent struggles of the twentieth century.");
		    System.out.println();
		    d.finalDetails("Gandhi: An Autobiography","Mahatma Gandhi","01-November-1993","Auto-Biography",1400.0);
			break;
		}
		case 3:
		{
			System.out.println("Thank you for choosing Long Walk To Freedom");
		    System.out.println("Description : From his birth in a village on the banks of the Mbashe River in the Transkei to his politicisation and development as a freedom fighter, this first volume of Nelson Mandela's classic autobiography charts the early years of his life, which culminated in his prison sentence in 1962. Emotive, compelling and uplifting, Long Walk to Freedom: Volume 1 tells the beginnings of the story of an epic life, a story of hardship, resilience and ultimate triumph conveyed with the clarity and eloquence of the outstanding moral and political leader of the twentieth century.");
		    System.out.println();
		    d.finalDetails("Long Walk To Freedom","Nelson Mandela","2002","Auto-Biography",900.0);
			break;
		}
		case 4:
		{
			System.out.println("Thank you for choosing I Am Malala: The Story of the Girl Who Stood Up for Education and Was Shot by the Taliban");
		    System.out.println("Description : I Am Malala is the remarkable tale of a family uprooted by global terrorism, of the fight for girls' education, of a father who, himself a school owner, championed and encouraged his daughter to write and attend school, and of brave parents who have a fierce love for their daughter in a society that prizes sons.");
		    System.out.println();
		    d.finalDetails("I Am Malala: The Story of the Girl Who Stood Up for Education and Was Shot by the Taliban","Malala Yousafzai","08-October-2013","Auto-Biography",1200.0);
			break;
		}
		}
		
	}
}
class History extends Non_Fictional
{
	public void HIS()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For The Rise and Fall of the Third Reich: A History of Nazi Germany");
		System.out.println("Enter 2 For D-Day, June 6, 1944: The Battle for the Normandy Beaches");
		System.out.println("Enter 3 For The Discovery of India");
		System.out.println("Enter 4 For Freedom at Midnight");
		
		int opt =sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{
			System.out.println("Thank you for choosing The Rise and Fall of the Third Reich: A History of Nazi Germany");
		    System.out.println("Description : The accounts of how the United States got involved and how Hitler used Mussolini and Japan are astonishing, and the coverage of the war-from Germany's early successes to her eventual defeat-is must reading");
		    System.out.println();
		    d.finalDetails("The Rise and Fall of the Third Reich: A History of Nazi Germany","William L. Shirer","15-November-1990","History",800.0);
			break;
		}
		case 2:
		{
			System.out.println("Thank you for choosing D-Day, June 6, 1944: The Battle for the Normandy Beaches");
		    System.out.println("Description : It is the young men born into the false prosperity of the 1920s and brought up in the bitter realities of the Depression of the 1930s that this book is about. The literature they read as youngsters was anti-war and cynical, portraying patriots as suckers, slackers and heroes. None of them wanted to be part of another war. They wanted to be throwing baseballs, not handgrenades; shooting .22s at rabbits, not M-1s at other young men. But when the test came, when freedom had to be fought for or abandoned, they fought (from the Prologue).");
		    System.out.println();
		    d.finalDetails("D-Day, June 6, 1944: The Battle for the Normandy Beaches","Stephen E. Ambrose","01-June-2002","History",1200.0);
			break;
		}
		case 3:
		{
			System.out.println("Thank you for choosing The Discovery of India");
		    System.out.println("Description : In conjunction with the Jawaharlal Nehru Memorial Fund in New Delhi, Oxford proudly announces the reissue of Glimpses of World History and The Discovery of India, two famous works by Jawaharlal Nehru. One of modern day's most articulate statesmen, Jawaharlal Nehru wrote a on a wide variety of subjects. Describing himself as \"a dabbler in many things,\" he committed his life not only to politics but also to nature and wild life, drama, poetry, history, and science, as well as many other fields. These two volumes help to illuminate the depth of his interests and knowledge and the skill and elegance with which he treated the written word!!");
		    System.out.println();
		    d.finalDetails("The Discovery of India","Jawaharlal Nehru","01-November-2004","History",1300.0);
			break;
		}
		case 4:
		{
			System.out.println("Thank you for choosing Freedom at Midnight");
		    System.out.println("Description : Seventy years ago, at midnight on August 14, 1947, the Union Jack began its final journey down the flagstaff of Viceroy’s House, New Delhi. A fifth of humanity claimed their independence from the greatest empire history has ever seen—but the price of freedom was high, as a nation erupted into riots and bloodshed, partition and war.");
		    System.out.println();
		    d.finalDetails("Freedom at Midnight","Larry Collins","11-January-2011","History",1100.0);
			break;
		}
		}
	}
}
class Memoirs extends Non_Fictional
{
	public void MEM()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For The Glass Castle");
		System.out.println("Enter 2 For The Diary of a Young Girl");
		System.out.println("Enter 3 For Escape");
		
		int opt =sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{
			System.out.println("Thank you for choosing The Glass Castle");
		    System.out.println("Description : A tender, moving tale of unconditional love in a family that, despite its profound flaws, gave the author the fiery determination to carve out a successful life on her own terms.");
		    System.out.println();
		    d.finalDetails("The Glass Castle","Jeannette Walls","17-January-2006","Memoirs",800.0);
			break;
		}
		case 2:
		{
			System.out.println("Thank you for choosing The Diary of a Young Girl");
		    System.out.println("Description : Discovered in the attic in which she spent the last years of her life, Anne Frank’s remarkable diary has become a world classic—a powerful reminder of the horrors of war and an eloquent testament to the human spirit.");
		    System.out.println();
		    d.finalDetails("The Diary of a Young Girl","Anne Frank","July 1993","Memoirs",900.0);
			break;
		}
		case 3:
		{
			System.out.println("Thank you for choosing Escape");
		    System.out.println("Description : The dramatic first-person account of life inside an ultra-fundamentalist American religious sect, and one woman’s courageous flight to freedom with her eight children.");
		    System.out.println();
		    d.finalDetails("Escape","Carolyn Jessop","31-December-2007","History",800.0);
			break;
		}
		}
	}
}

class Poetry extends Books
{
	public void POE()
	{
		Books B1=new Narritive();
		Narritive nar=(Narritive)B1;
		
		Books B2=new Dramatic();
		Dramatic dra=(Dramatic)B2;
		
		Books B3=new Lyrical();
		Lyrical lyr=(Lyrical)B3;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 For Narritive Poetry Books :");
		System.out.println("Enter 2 For Dramatic Poetry Books :");
		System.out.println("Enter 3 For Lyrical Poetry Books :");
		
int opt=sc.nextInt();
		
		switch (opt) 
		{
		case 1: 
		{
			System.out.println("You Choosen Narritive Poetry Books :");
			nar.NAR();
		}
		case 2: 
		 {
			System.out.println("You Choosen Dramatic Poetry Books :");
			dra.DRA();
		 }
		case 3: 
		 {
			System.out.println("You Choosen Lyrical Poetry Books :");
			lyr.LYR();
		 }
		 default:
		 {
			System.out.println("Invalid Output"); 
			System.out.println();
		 }
		 }
	}
}
class Narritive extends Poetry
{
	public void NAR()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For The Creep");
		System.out.println("Enter 2 For The Canterbury Tales");
		
		int opt =sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{
			System.out.println("Thank you for choosing The Creep");
		    System.out.println("Description : Unknown");
		    System.out.println();
		    d.finalDetails("The Creep","Chriselda Barretto","23-September-2018","Narritive Poetry",300.0);
			break;
		}
		case 2:
		{
			System.out.println("Thank you for choosing The Canterbury Tales");
		    System.out.println("Description : Unknown");
		    System.out.println();
		    d.finalDetails("The Canterbury Tales","Unknown","30-January-2003","Narritive Poetry",400.0);
			break;
		}
		default:
		 {
			System.out.println("Invalid Output"); 
			System.out.println();
		 }
		}
		
		
	}
}
class Dramatic extends Poetry
{
	public void DRA()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For The Complete Poems of Emily Dickinson");
		System.out.println("Enter 2 For Leaves of Grass");
		
		int opt =sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{
			System.out.println("Thank you for choosing The Creep");
		    System.out.println("Description : Unknown");
		    System.out.println();
		    d.finalDetails("The Complete Poems of Emily Dickinson","Emily Dickinson","30-January-1976","Dramatic Poetry",300.0);
			break;
		}
		case 2:
		{
			System.out.println("Thank you for choosing Leaves of Grass");
		    System.out.println("Description : Unknown");
		    System.out.println();
		    d.finalDetails("Leaves of Grass","Walt Whitman","01-August-2006","Dramatic Poetry",200.0);
			break;
		}
		default:
		 {
			System.out.println("Invalid Output"); 
			System.out.println();
		 }
		}
	}
}
class Lyrical extends Poetry
{
	public void LYR()
	{
		Details d=new Details();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 For Shakespeare's Sonnets");
		System.out.println("Enter 2 For Wiersze wybrane");
		
		int opt =sc.nextInt();
		
		switch(opt)
		{
		case 1:
		{
			System.out.println("Thank you for choosing Shakespeare's Sonnets");
		    System.out.println("Description : The Arden Shakespeare has long been acclaimed as the established scholarly edition of Shakespeare's work. Now being totally reedited for the third time, Arden editions offer the very best in contemporary scholarship. Each volume provides a clear and authoritative text, edited to the highest standards; detailed textual notes and commentary on the same page of the text; full contextual, illustrated introduction, including an in-depth survey of critical and performance approaches to the play; and selected bibliography. ");
		    System.out.println();
		    d.finalDetails("Shakespeare's Sonnets","William Shakespeare,","21-August-1997","Lyrical Poetry",300.0);
			break;
		}
		case 2:
		{
			System.out.println("Thank you for choosing Wiersze wybrane");
		    System.out.println("Description : Unknown");
		    System.out.println();
		    d.finalDetails("Wiersze wybrane","Wisława Szymborska","January 2007","Lyrical Poetry",200.0);
			break;
		}
		default:
		 {
			System.out.println("Invalid Output"); 
			System.out.println();
		 }
		}
	}
}

class Details
{
	public void finalDetails(String Book_Name,String Book_Author_Name,String Book_Genre,String Book_Released_Date,double Book_Price)
	{
		Books Boo=new Books();
		
		System.out.println("Choose Payment Option\n");
		System.out.println("To Pay With Cash Press 1");
		System.out.println("To Pay With UPI Press 2");
		
		Scanner sc=new Scanner(System.in);
		
		int opt=sc.nextInt();
		
		switch (opt) {
		case 1:
		System.out.println("You Have Choosen Payment option Through Cash");
		break;

		case 2:
		System.out.println("You Have Choosen Payment option Through UPI");
		break;

		default:
		System.out.println("Invaild Input ");
		break;
		}
		
		System.out.println("Enter Your Name\n");
		String oname=sc.nextLine();
		Boo.setBook_owner_name(oname);
		System.out.println();
		
		System.out.println("Enter Your Mobile no.\n");
		String onum=sc.nextLine();
		Boo.setBook_owner_Mobile_no(onum);
		System.out.println();
		
		System.out.println("Enter Your Email ID\n");
		String omail=sc.nextLine();
		Boo.setBook_owner_EmailId(omail);
		System.out.println();
		
		Boo.pass(Book_Name, Book_Author_Name, Book_Genre, Book_Released_Date, Book_Price);
		Boo.getDetails();
		
		System.out.println("");
		System.out.println("Thank You For Purchasing a Book From Our Store...!!!");
		System.out.println("Have a great Day Sir :)");
		System.out.println("");
		
		Boo.Howtoreadbooks();
		Boo.whyreadbooks();
	}
}
public class Library 
{

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) 
	{
		Books ref1=new Fictional();
		Fictional ref2=(Fictional)ref1;
		System.out.println("Press 1 For Fictional Books");
		
		Books ref3=new Non_Fictional();
		Non_Fictional ref4=(Non_Fictional)ref3;
		System.out.println("Press 2 For Non-Fictional Books");
		
		Books ref5=new Poetry();
		Poetry ref6=(Poetry)ref5;
		System.out.println("Press 3 For Poetry Books");
		
		Scanner sc=new Scanner(System.in);
		int a=0;
		
		try {
			a = sc.nextInt();
			} catch (InputMismatchException ie)
			{
			System.out.println("The Enter The Valid Input");
			System.out.println();
			}
		switch (a) 
		{
		case 1: 
		{
			System.out.println("You have choosen Fictional Books");
			ref2.FIC();
		}
		case 2: 
		{
			System.out.println("You have choosen Non-Fictional Books");
			ref4.NfC();
		}
		case 3: 
		{
			System.out.println("You have choosen Poetry Books");
			ref6.POE();
		}
		default:
			System.out.println("Invalid Input");
			System.out.println();
			main(args);
			break;
		}

	}
	static
	{
		System.out.println("Welcome to the Book Store");
		System.out.println("May I Help U???");
		System.out.println("Which Book You Want to Buy??");
		System.out.println("======================================");
	}

}
