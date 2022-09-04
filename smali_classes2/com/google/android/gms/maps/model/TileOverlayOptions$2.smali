.class Lcom/google/android/gms/maps/model/TileOverlayOptions$2;
.super Lcom/google/android/gms/maps/model/a/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/model/TileOverlayOptions;->a(Lcom/google/android/gms/maps/model/l;)Lcom/google/android/gms/maps/model/TileOverlayOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/model/l;

.field final synthetic b:Lcom/google/android/gms/maps/model/TileOverlayOptions;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/model/TileOverlayOptions;Lcom/google/android/gms/maps/model/l;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions$2;->b:Lcom/google/android/gms/maps/model/TileOverlayOptions;

    iput-object p2, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions$2;->a:Lcom/google/android/gms/maps/model/l;

    invoke-direct {p0}, Lcom/google/android/gms/maps/model/a/j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(III)Lcom/google/android/gms/maps/model/Tile;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/TileOverlayOptions$2;->a:Lcom/google/android/gms/maps/model/l;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/maps/model/l;->a(III)Lcom/google/android/gms/maps/model/Tile;

    move-result-object v0

    return-object v0
.end method
