.class Lcom/google/android/gms/maps/i$2;
.super Lcom/google/android/gms/maps/a/o$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/i;->a(Lcom/google/android/gms/maps/i$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/i$a;

.field final synthetic b:Lcom/google/android/gms/maps/i;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/i;Lcom/google/android/gms/maps/i$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/i$2;->b:Lcom/google/android/gms/maps/i;

    iput-object p2, p0, Lcom/google/android/gms/maps/i$2;->a:Lcom/google/android/gms/maps/i$a;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/i$2;->a:Lcom/google/android/gms/maps/i$a;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/i$a;->a(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)V

    return-void
.end method
