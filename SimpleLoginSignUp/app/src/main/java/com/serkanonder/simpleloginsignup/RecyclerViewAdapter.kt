package com.serkanonder.simpleloginsignup

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()  {

    private val itemTitles = arrayOf(
        "Arabica",
        "Cafe Nero",
        "CoffeLab",
        "McDonalds",
        "Starbucks",
    )

    private val itemDetails = arrayOf(
        "Ülkemizde her geçen gün gelişen ve önem kazanan kahve sektörünün öncülerinden olan Arabica Coffee House, sektör lideri olabilme hedefi ile, Mimar Elif ÜLGER YALÇIN ve Av. Sertaç YALÇIN tarafından, Ankara merkezli olarak 2014 yılında kurulmuştur.Üçüncü dalga kahve akımının da öncülerinden olan Arabica Coffee House; nitelikli Arabica kahve çekirdeklerini ithal ederek kendisi kavurmakta ve taze olarak tüm şubelerinde misafirlerine sunmaktadır. Bu kapsamda Arabica Coffee House, üçüncü dalga kahve akımına ve butik hizmet anlayışına uygun yüksek kaliteli ekipman ve demleme araçları kullanmaktadır.",
        "Cafe Nero, 1997 yılında İngiltere'de kurulmuş bir kahve zinciri. 2008 yılında İngiltere'de 100. şubesini açmıştır. 2010 yılında İngiltere'de 200. şubesini açmıştır. 2012 yılında İngiltere'de 300. şubesini açmıştır. 2014 yılında İngiltere'de 400. şubesini açmıştır. 2016 yılında İngiltere'de 500. şubesini açmıştır. 2018 yılında İngiltere'de 600. şubesini açmıştır. 2020 yılında İngiltere'de 700. şubesini açmıştır. 2021 yılında İngiltere'de 800. şubesini açmıştır. 2022 yılında İngiltere'de 900. şubesini açmıştır. 2023 yılında İngiltere'de 1000. şubesini açmıştır. 2024 yılında İngiltere'de 1100. şubesini açmıştır. 2025 yılında İngiltere'de 1200. şubesini açmıştır. 2026 yılında İngiltere'de 1300. şubesini açmıştır. 2027 yılında İngiltere'de 1400. şubesini açmıştır. 2028 yılında İngiltere'de 1500. şubesini açmıştır. 2029 yılında İngiltere'de 1600. şubesini açmıştır. 2030 yılında İngiltere'de 1700. şubesini açmıştır. 2031 yılında İngiltere'de 1800. şubesini açmıştır. 2032 yılında İngiltere'de 1900. şubesini açmıştır.",
        "CoffeLab, 1997 yılında İngiltere'de kurulmuş bir kahve zinciri. 2008 yılında İngiltere'de 100. şubesini açmıştır. 2010 yılında İngiltere'de 200. şubesini açmıştır. 2012 yılında İngiltere'de 300. şubesini açmıştır. 2014 yılında İngiltere'de 400. şubesini açmıştır. 2016 yılında İngiltere'de 500. şubesini açmıştır. 2018 yılında İngiltere'de 600. şubesini açmıştır. 2020 yılında İngiltere'de 700. şubesini açmıştır. 2021 yılında İngiltere'de 800. şubesini açmıştır. 2022 yılında İngiltere'de 900. şubesini açmıştır. 2023 yılında İngiltere'de 1000. şubesini açmıştır. 2024 yılında İngiltere'de 1100. şubesini açmıştır. 2025 yılında İngiltere'de 1200. şubesini açmıştır. 2026 yılında İngiltere'de 1300. şubesini açmıştır. 2027 yılında İngiltere'de 1400. şubesini açmıştır. 2028 yılında İngiltere'de 1500. şubesini açmıştır. 2029 yılında İngiltere'de 1600. şubesini açmıştır. 2030 yılında İngiltere'de 1700. şubesini açmıştır. 2031 yılında İngiltere'de 1800. şubesini açmıştır. 2032 yılında İngiltere'de 1900. şubesini açmıştır.",
        "McDonald's, 1997 yılında İngiltere'de kurulmuş bir kahve zinciri. 2008 yılında İngiltere'de 100. şubesini açmıştır. 2010 yılında İngiltere'de 200. şubesini açmıştır. 2012 yılında İngiltere'de 300. şubesini açmıştır. 2014 yılında İngiltere'de 400. şubesini açmıştır. 2016 yılında İngiltere'de 500. şubesini açmıştır. 2018 yılında İngiltere'de 600. şubesini açmıştır. 2020 yılında İngiltere'de 700. şubesini açmıştır. 2021 yılında İngiltere'de 800. şubesini açmıştır. 2022 yılında İngiltere'de 900. şubesini açmıştır. 2023 yılında İngiltere'de 1000. şubesini açmıştır. 2024 yılında İngiltere'de 1100. şubesini açmıştır. 2025 yılında İngiltere'de 1200. şubesini açmıştır. 2026 yılında İngiltere'de 1300. şubesini açmıştır. 2027 yılında İngiltere'de 1400. şubesini açmıştır. 2028 yılında İngiltere'de 1500. şubesini açmıştır. 2029 yılında İngiltere'de 1600. şubesini açmıştır. 2030 yılında İngiltere'de 1700. şubesini açmıştır. 2031 yılında İngiltere'de 1800. şubesini açmıştır. 2032 yılında İngiltere'de 1900. şubesini açmıştır.",
        "Starbucks, 1997 yılında İngiltere'de kurulmuş bir kahve zinciri. 2008 yılında İngiltere'de 100. şubesini açmıştır. 2010 yılında İngiltere'de 200. şubesini açmıştır. 2012 yılında İngiltere'de 300. şubesini açmıştır. 2014 yılında İngiltere'de 400. şubesini açmıştır. 2016 yılında İngiltere'de 500. şubesini açmıştır. 2018 yılında İngiltere'de 600. şubesini açmıştır. 2020 yılında İngiltere'de 700. şubesini açmıştır. 2021 yılında İngiltere'de 800. şubesini açmıştır. 2022 yılında İngiltere'de 900. şubesini açmıştır. 2023 yılında İngiltere'de 1000. şubesini açmıştır. 2024 yılında İngiltere'de 1100. şubesini açmıştır. 2025 yılında İngiltere'de 1200. şubesini açmıştır. 2026 yılında İngiltere'de 1300. şubesini açmıştır. 2027 yılında İngiltere'de 1400. şubesini açmıştır. 2028 yılında İngiltere'de 1500. şubesini açmıştır. 2029 yılında İngiltere'de 1600. şubesini açmıştır. 2030 yılında İngiltere'de 1700. şubesini açmıştır. 2031 yılında İngiltere'de 1800. şubesini açmıştır. 2032 yılında İngiltere'de 1900. şubesini açmıştır.",
    )

    private val itemImages = arrayOf(
        R.drawable.arabica,
        R.drawable.cafenero,
        R.drawable.coffelab,
        R.drawable.mcdonalds,
        R.drawable.starbucks
    )


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image : ImageView
        var textTitle : TextView
        var textDes : TextView

        init {
            image = itemView.findViewById(R.id.item_image)
            textTitle = itemView.findViewById(R.id.item_title)
            textDes = itemView.findViewById(R.id.item_details)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_model, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textTitle.text = itemTitles[position]
        holder.textDes.text = itemDetails[position]
        holder.image.setImageResource(itemImages[position])

        holder.itemView.setOnClickListener {v: View ->

            Toast.makeText(v.context, "Clicked on ${itemTitles[position]}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }
}