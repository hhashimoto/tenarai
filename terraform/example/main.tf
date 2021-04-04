terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 3.0"
    }
  }
}

provider "aws" {
  region = "ap-northeast-1"
}

module "web_server" {
  source = "./http_server"
  instance_type = var.example_instance_type
}

variable "example_instance_type" {
  default = "t3.micro"
}
