.class Lcom/google/android/gms/maps/c$12;
.super Lcom/google/android/gms/maps/a/ap$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$q;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$q;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$12;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$12;->a:Lcom/google/android/gms/maps/c$q;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/ap$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/a/g;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$12;->a:Lcom/google/android/gms/maps/c$q;

    new-instance v1, Lcom/google/android/gms/maps/model/g;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/g;-><init>(Lcom/google/android/gms/maps/model/a/g;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$q;->d(Lcom/google/android/gms/maps/model/g;)Z

    move-result v0

    return v0
.end method
