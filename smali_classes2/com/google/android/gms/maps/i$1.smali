.class Lcom/google/android/gms/maps/i$1;
.super Lcom/google/android/gms/maps/a/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/i;->a(Lcom/google/android/gms/maps/i$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/i$b;

.field final synthetic b:Lcom/google/android/gms/maps/i;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/i;Lcom/google/android/gms/maps/i$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/i$1;->b:Lcom/google/android/gms/maps/i;

    iput-object p2, p0, Lcom/google/android/gms/maps/i$1;->a:Lcom/google/android/gms/maps/i$b;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/p$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/i$1;->a:Lcom/google/android/gms/maps/i$b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/i$b;->a(Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;)V

    return-void
.end method
