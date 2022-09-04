.class Lcom/google/android/gms/maps/i$4;
.super Lcom/google/android/gms/maps/a/r$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/i;->a(Lcom/google/android/gms/maps/i$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/i$d;

.field final synthetic b:Lcom/google/android/gms/maps/i;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/i;Lcom/google/android/gms/maps/i$d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/i$4;->b:Lcom/google/android/gms/maps/i;

    iput-object p2, p0, Lcom/google/android/gms/maps/i$4;->a:Lcom/google/android/gms/maps/i$d;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/r$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/i$4;->a:Lcom/google/android/gms/maps/i$d;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/i$d;->a(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)V

    return-void
.end method
