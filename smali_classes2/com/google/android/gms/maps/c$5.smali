.class Lcom/google/android/gms/maps/c$5;
.super Lcom/google/android/gms/maps/a/ae$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$h;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$5;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$5;->a:Lcom/google/android/gms/maps/c$h;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/ae$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/a/c;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$5;->a:Lcom/google/android/gms/maps/c$h;

    new-instance v1, Lcom/google/android/gms/maps/model/c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/c;-><init>(Lcom/google/android/gms/maps/model/a/c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$h;->a(Lcom/google/android/gms/maps/model/c;)V

    return-void
.end method
