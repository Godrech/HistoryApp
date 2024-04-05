package history.app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    //declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button
    private lateinit var  openButton: Button






    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        searchButton= findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)

        searchButton.setOnClickListener{
            //create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

            //if age is not null and age is in the range between
            if (age != null && age in 20 .. 100) {
                //when age is 30 display Thato else when is .. and so on
                val employeeName = when (age) {

                    50 -> "MICHAEL JACKSON." +
                            "" +
                            "   On August 29, 1958, Michael Jackson was born in Gary, Indiana." +
                            "He was one of the most recognizable pop music performer of all time, as well as a singer, composer, and dancer." +
                            "It is believed that the cause of his death was homicide"

                    39 -> " MARTIN LUTHER KING." +
                            "" +
                            "   He was born on January 15, 1929, in Atlanta, Georgia." +
                            "He is known for his contributions to the American civil rights movement in the 1960s." +
                            "He was shot and killed while standing on the second-floor balcony of his Memphis, Tennessee, room at the Lorraine Motel. At 7:05 p.m."

                    42 -> "ELVIS PRESLEY." +
                            "" +
                            "   He was born on January 8, 1935, in Tupelo, Mississippi." +
                            "He was an actor and singer from America. He is regarded as one of the most influential cultural figures of the 20th century and is known as the King of Rock and Roll." +
                            "He suffered from chronic constipation, his abdominal aorta was crushed as he forcefully tried to defecate, stopping his heart."

                    67 -> "GEORGE WASHINGTON." +
                            "" +
                            "   George Washington was born on February 22, 1732, at his family's property on Popes Creek in Westmoreland County, Virginia." +
                            "He first American president, farmer, president of the Constitutional Convention, and leader of the Continental Army." +
                            "He passed away from a throat infection."

                    78 -> "MAHATMA GANDHI." +
                            "" +
                            "   He was born on October 2, 1869, in the Gujarati town of Porbandar, in western India." +
                            "He was a key figure in the Indian liberation movement. Mahatma Gandhi was well known for his nonviolent and truth-based policies." +
                            "He was assassinated on January 30, 1948, during an interfaith prayer gathering in Delhi, by getting  three bullet shots into his chest."

                    96 -> "QUEEN ELIZABETH II." +
                            "" +
                            "   She was born in Mayfair, London, at 17 Bruton Street in the morning on April 21, 1926." +
                            "She was the queen of the United Kingdom. She became a well adored and respected figure worldwide and ruled longer than any other monarch in British history." +
                            "She died of old age"

                    41 -> "SHAKA ZULU." +
                            "" +
                            "   He was born in Melmoth, KwaZulu-Natal Province, South Africa, in the lunar month of July, 1787." +
                            "He is known as the founder of what would become known as the “Zulu nation”. " +
                            "He was murdered in 1828 by two of his half-brothers."

                    84 -> "ISAAC NEWTON." +
                            "" +
                            "   He was born On December 25, 1642, Christmas Day at Woolsthorpe Manor in Woolsthorpe." +
                            "Along with discovering the laws of gravity, he also made significant contributions to calculus and worked out many of the principles governing visible light and motion." +
                            "He died in 1727 during his sleep at the age of 84 and the cause of death is unknown"

                    76-> "ALBERT EINSTEIN." +
                            "" +
                            "   He was born at Ulm, in Württemberg, Germany, on March 14, 1879." +
                            "He was a scientist know for revolutionizing physics with his general theory of relativity." +
                            "Einstein died of a ruptured abdominal aortic aneurysm on April 18, 1955."

                    54-> "JOSEPH KASA-VUBU." +
                            "" +
                            "   He was born in the village of Kuma-Dizi in the Mayombe district in the Bas-Congo, in the west of the Belgian Congo." +
                            "He became the leader of the Alliance des Bakongo (ABAKO) party in the 1950s and soon became a leading proponent of Congo's independence from Belgian colonial rule. " +
                            " Kasa-Vubu died in a hospital in Boma four years later in 1969, possibly after a long illness."

                    else -> null
                }
                val message = if (employeeName != null) "  $employeeName"
                else "No historical person found with the entered age."
                resultTextView.text = message
            } else{
                resultTextView.text = "Invalid input. PLease enter a valid age between 20 and 100."

            }
        }

        clearButton.setOnClickListener{
            ageInput.text.clear()
            resultTextView.text = ""

            

        }


    }
}
//Michael Jackson.
//
//Author: Rickey Vincent
//Date accessed: 4 April 2024
//Link: https://www.britannica.com/biography/Michael-Jackson

//Martin Luther King
//
//Author: Lewis & Carson
//Date accessed: 4 April 2024
//Link: https://www.britannica.com/biography/Martin-Luther-King-Jr

//Elvis Presley
//
//Author: Biography.com
//Date accessed: 4 April 2024
//Link: https://www.biography.com/musicians/elvis-presley

//George Washington
//
//Author: Henry Graff
//Date accessed: 4 April 2024
//Link: https://www.britannica.com/biography/George-Washington
//
//Mahatma Gandhi
//Author: B.R. Nanda
//Date accessed: 4 April 2024
//Link: https://www.britannica.com/biography/Mahatma-Gandhi

//Elizabeth II
//
//Author: The Editors of Encyclopædia Britannica
//Date accessed: 4 April 2024
//Link: https://www.britannica.com/biography/Elizabeth-II

//Shaka Zulu
//
//Author: Donald R. Morris
//Date accessed: 4 April 2024
//Link: https://www.britannica.com/biography/Shaka-Zulu-chief

//Isaac Newton
//Author: Richard S. Westfall
//Date accessed: 4 April 2024
//Link: https://www.britannica.com/biography/Isaac-Newton

//Albert Einstein
//
//Author: Michio Kaku
//Date accessed: 4 April 2024
//Link: https://www.britannica.com/biography/Albert-Einstein

//Joseph Kasa-Vubu
//
//Author: The Editors of Encyclopædia Britannica
//Date accessed: 4 April 2024
//Link: https://www.britannica.com/biography/Joseph-Kasavubu
