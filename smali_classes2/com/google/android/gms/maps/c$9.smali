.class Lcom/google/android/gms/maps/c$9;
.super Lcom/google/android/gms/maps/a/at$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$u;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$u;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$9;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$9;->a:Lcom/google/android/gms/maps/c$u;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/at$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/PointOfInterest;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/c$9;->a:Lcom/google/android/gms/maps/c$u;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/c$u;->a(Lcom/google/android/gms/maps/model/PointOfInterest;)V

    return-void
.end method
