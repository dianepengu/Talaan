import ReactCurvedText from 'react-curved-text'

export default function ForPinoys() {
  return (
    <ReactCurvedText
      width={300}
      height={300}
      cx={150}
      cy={150}
      rx={100}
      ry={100}
      startOffset={150}
      reversed={true}
      text="f o r  P i n o y s !"
      textProps={{ style: { fontSize: 24 }  }}
      textPathProps={null}
      tspanProps={null}
      ellipseProps={null}
      svgProps={null}
    />
  );
}
