using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Web;

namespace ORM.Models
{

    [Table("Book")] //Name Table
    public class Book
    {

        public int Id { get; set; }

        [MaxLength(80)]  //column annotation
        [Required]
        public string Title { get; set; }

        [MaxLength(60)]
        [Required]
        public string Author { get; set; }

        public string Price { get; set; }

        [DisplayFormat(DataFormatString = "{0:dd/MM/yyyy}")]
        public DateTime Date { get; set; }



    }
}