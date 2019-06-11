package com.megri

import com.raquo.airstream.eventbus.EventBus

object App {
  val eb = new EventBus[String]

  def main(args: Array[String]): Unit = {
    this.eb // the completion to `.eb` works
    this.eb.events // as do the completion from `.eb` to `.eb.events`
    this.eb.events. // but completing here locks the metals server for me.
  }
}
