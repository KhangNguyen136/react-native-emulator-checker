import { useState, useEffect } from 'react';
import { StyleSheet, View, Text } from 'react-native';
import { isEmulator } from 'react-native-emulator-checker';

export default function App() {
  const [result, setResult] = useState<boolean>();

  useEffect(() => {
    isEmulator().then(setResult);
  }, []);

  return (
    <View style={styles.container}>
      <Text>Is running on emulator: {result}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
