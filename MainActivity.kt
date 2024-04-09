package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaration the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val biCancel = findViewById<Button>(R.id.btnCancel)
        val txtResults = findViewById<TextView>(R.id.txtResults)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val results = when (age) {
                    in 20 ..28-> "one"
                    in 29.. 36-> "two"
                    in 37..44 -> "three"
                    in 45.. 52-> "four"
                    in 53..60 -> "five"
                    in 61..68 -> "six"
                    in 69..76 -> "seven"
                    in 77..84 -> "eight"
                    in 85.. 92-> "nine"
                    in 93..100 ->"ten"
                    else -> "not-valid"
                }
                txtResults.text = "Age: $age\n${
                    when (results) {
                        "one" -> "River Phoenix was an activist, musician, and actor from the United States. He was born in Madras, Oregon, on August 23, 1970, and sadly died on October 31, 1993, at the age of 23.At an early age, Phoenix made appearances in TV shows and commercials to launch his acting career.Phoenix had a strong passion for music in addition to acting. River was the lead guitarist and vocalist for the band Aleka's Attic, which he and his siblings founded. Sadly, on Halloween night in 1993, River Phoenix's life was taken too soon when he overdosed on drugs outside the Viper Room, a nightclub in West Hollywood, California."
                        "two"->"Henry VIII of England's third wife was Jane Seymour. Her death occurred in 1537; she was born in 1508 or 1509. The main reason for Seymour's notoriety is that she was the only wife of Henry VIII to bear him a son, future King Edward VI. Her time as queen consort was brief, though, as she passed away only 12 days after giving birth to Edward.Compared to Henry's previous wives, Jane Seymour came from a very different background. She was Sir John Seymour of Wiltshire daughter and a member of the English nobility. Her lineage had long supported the Tudor dynasty. Before capturing the attention of King Henry VIII, Jane worked as a maid of honor for both Anne Boleyn and Catherine of Aragon. Jane Seymour was a respected queen, even though her reign was brief. Unlike the more assertive Anne Boleyn, she was renowned for being kind and obedient. Henry was buried next to her after he passed away, having grieved her passing away.Being the mother of Edward VI, Henry's only surviving legitimate male heir, Jane Seymour left behind a lasting legacy. Her son would rise to prominence as king at an early age and pass away soon after, leaving a complex legacy in English history. Van Gogh started his artistic career somewhat later in life. Even though he had a strong interest in art from a young age, he first went after other careers, such as teaching and art sales. He didn't make the decision to focus only on painting until he was well into his late twenties. He taught himself how to paint and draw, and the Dutch Masters, including Rembrandt and Vermeer, had an influence on his early creations. Van Goth's mental health deteriorated over time, and he struggled with episodes of severe depression and anxiety. In 1888, he famously severed a portion of his own ear during a psychotic episode. He willingly checked himself into a Saint-Remy-de-Provence mental health facility, where he made a lot of paintings despite his difficulties. Van Goth's life was tragically cut short at the age of 37 when he committed suicide. In spite of his difficulties and short career, he had a significant influence on the art world. Vincent van Gogh is hailed today as a visionary artist whose intensely personal paintings still enthrall and motivate viewers everywhere. His reputation as a trailblazing figure in modern art is well-established, and his paintings are among the most valuable and sought-after in the entire globe."
                        "three" -> "One of the most famous painters of all time is Vincent van Gogh, a Dutch post-impressionist painter. He was born in Undertone, Netherlands, on March 30, 1853, and passed away in Avers-sur-Oise, France, on July 29, 1890. Despite enduring a severe battle with mental illness and other personal struggles throughout his life and career, Van Gogh created 5 of the most famous and significant pieces of Western art history. "
                        "four" -> "Born Farrokh Pulsar on September 5, 1946, Freddie Mercury was a British singer-songwriter best known for being the charismatic " +
                                "front man of the iconic rock group Queen. He is considered by many to be among the best singers in popular music history. With his striking vocal range, commanding voice, and flamboyant stage persona, Mercury became a legendary figure in the music business.Mercury was born to Pars parents of Indian descent in Zanzibar, which is now a part of Tanzania. After leaving his native India to pursue his studies in art and design, he eventually relocated to England. He formed the band Queen at the beginning of the 1970s with guitarist Brian May, drummer Roger Taylor, and bassist John Deacon. With his captivating performances and catchy tunes, Mercury—who also serves as Queen's lead vocalist and pianist—helped the band become well-known throughout the world. Many of Queen's greatest hits, such as \"Bohemian Rhapsody,\" \"Somebody to Love,\" \"We Are the Champions,\" and \"Don't Stop Me Now,\" were penned by him. Freddie Mercury tragically lost his life on November 24, 1991, at the age of 45, as a result of complications from AIDS. Although the music industry was shocked by his passing, his legacy as a trailblazing musician and cultural icon lives on. Mercury's influence on music is still felt today, and his songs are still cherished by listeners all over the world. To commemorate Freddie Mercury and spread awareness of AIDS, the surviving members of Queen staged the Freddie Mercury Tribute Concert at Wembley Stadium in 1992"
                        "five"-> "German philosopher, cultural critic, poet, and philologist Friedrich Nietzsche was born in Bracken, Prussia (now in Germany) on October 15, 1844, and passed away in Weimar, Germany, on August 25, 1900. In addition to having a significant impact on postmodernism, nihilism, and existentialism, he is most recognized for his criticisms of conventional Western morality and religion. Nietzsche's philosophical writings are distinguished by their thought-provoking and frequently contentious concepts. He promoted the rejection of conventional Christian values because he thought they limited people's potential and inventiveness. Nietzsche instead put forth the notion of the \"Ubermensch,\" or \"overran,\" a figure that stands for the person who rejects conventional morality and chooses to live a life that fully realizes the potential of human existence. Nietzsche is regarded as one of the most important philosophers of the modern era, despite his convoluted and frequently contentious ideas. Scholars from a variety of fields, such as literature, philosophy, psychology, and sociology, are still analyzing and debating his writings. "
                        "six" -> "Born in Oak Park, Illinois, on July 21, 1899, Ernest Hemingway was an American novelist, journalist, and writer of short stories. He passed away in Ketchup, Idaho, on July 2, 1961. He is regarded as one of the most important authors of the 20th century, and he is well-known for his portrayal of subjects like the human condition, masculinity, and war in a clear and modest prose style. Hemingway frequently addressed courage, honor, stoicism, and the quest for purpose in an uncertain world. His characters struggle with existential issues and the certainty of death on a regular basis. The main characters in Hemingway's works frequently exhibit grace and resilience under duress, despite their frequently tragic circumstances.Hemingway, regrettably, battled mental illness and went through depressive episodes all of his life. He left a lasting legacy as one of the most renowned and significant authors in American literature when he committed suicide in 1961. His writings are still studied and appreciated today because of their timeless understanding of the human condition. "
                        "seven" -> "Born in London, England on February 21, 1946, Alan Rick-man was a British actor and director who passed away there on January 14, 2016. His voice was unique, he had a versatile skill set, and he gave memorable stage, movie, and television performances. Many people considered Rick-man to be among the best actors of his generation.In addition to his acting career, Rick-man has directed motion pictures, such as \"A Little Chaos\" and \"The Winter Guest.\" He was well-known for his devotion to developing new artists and his devotion to his craft. Upon his passing in 2016, fans all over the world expressed their sorrow, recalling Alan Rick-man as a flawless actor who had a remarkable ability to give his roles depth and complexity. His timeless performances and his lasting influence on the film industry are testaments to his legacy. "
                        "eight"-> "Galileo Galilei was an Italian astronomer, physicist, and mathematician who played a pivotal role in the Scientific Revolution of the 17th century. He was born on February 15, 1564, in Pisa, Italy, and died on January 8, 1642, in Parametric, Italy. Galileo's contributions to the fields of astronomy, physics, and mathematics fundamentally changed our understanding of the natural world and laid the groundwork for modern science."
                        "nine" -> "Famous English author Agatha Christie (1890–1976) is most known for her plays, short stories, and detective novels. Because of her numerous contributions to the genre, she is frequently referred to as the \"Queen of Mystery\" or the \"Queen of Crime.\" Hercules Poirot, a Belgian detective, and Miss Marple, an elderly spinster with a sharp eye for crime solving, are two of her most well-known characters.plots, deftly placed clues, and surprising turns. Her books have been translated into many languages and have sold millions of copies worldwide. "
                        "ten" -> "Actor and politician Ronald Wilson Reagan (1911–2004) presided as the 40th President of the United States from 1981 to 1989. He grew up in Dixon, Illinois, having been born in Tampico, Illinois. Reagan enjoyed a prosperous career in Hollywood as a television personality and actor, appearing in many films and series before becoming president.Reagan easily defeated then-President Jimmy Carter in 1980 after winning the Republican presidential nomination. Reagan pursued conservative economic policies as president, such as deregulation, tax cuts, and free-market ideas. In addition, he adopted a stern anti-communist foreign policy, pushing for higher defense budget and opposing the Soviet Union. Reagan continues to have a significant impact on American politics despite scandals and criticism, especially among conservatives. His optimism, charm, and leadership during a critical juncture in American history are often remembered. Reagan retired to California after leaving government service, where he lived until his passing in 2004. The Ronald Reagan Presidential Library in Simi Valley, California is where he is interred. "
                        else -> ""
                    }

                }"
            } else {
                txtResults.text = "Please enter a valid"
            }
        }
        biCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResults.text= ""
        }
    }
}
