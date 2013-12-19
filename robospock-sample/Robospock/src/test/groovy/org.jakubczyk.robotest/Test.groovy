package org.jakubczyk.robotest

import android.widget.TextView
import org.robolectric.Robolectric
import org.robolectric.annotation.Config
import pl.polidea.robospock.RoboSpecification;

@Config(manifest = "./robospock-sample/AndroidSampleProject/src/main/AndroidManifest.xml")
class Test extends RoboSpecification {

    def "HashMap accepts null key"() {
        setup:
        def mainActivity = Robolectric.buildActivity(MainActivity.class).create().get()

        when:
        def tv = (TextView) mainActivity.findViewById(R.id.tv)

        then:
        "Hello world!" == tv.getText()
    }

}