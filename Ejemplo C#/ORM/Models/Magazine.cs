using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Web;

namespace ORM.Models
{

    [Table("Magazine")]
    public class Magazine
    {

        public int  Id { get; set; }

        [MaxLength(40)]
        public string Name { get; set; }

        public string Price { get; set; }

        [DisplayFormat(DataFormatString = "{0:dd/MM/yyyy}")]
        public DateTime EditionDate { get; set; }



    }
}