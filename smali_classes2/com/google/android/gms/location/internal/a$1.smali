.class Lcom/google/android/gms/location/internal/a$1;
.super Lcom/google/android/gms/location/internal/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/internal/a;->a(Lcom/google/android/gms/common/api/g;JLandroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Landroid/app/PendingIntent;

.field final synthetic c:Lcom/google/android/gms/location/internal/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/internal/a;Lcom/google/android/gms/common/api/g;JLandroid/app/PendingIntent;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/location/internal/a$1;->c:Lcom/google/android/gms/location/internal/a;

    iput-wide p3, p0, Lcom/google/android/gms/location/internal/a$1;->a:J

    iput-object p5, p0, Lcom/google/android/gms/location/internal/a$1;->b:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lcom/google/android/gms/location/internal/a$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/internal/l;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/a$1;->a(Lcom/google/android/gms/location/internal/l;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/location/internal/l;)V
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/location/internal/a$1;->a:J

    iget-object v2, p0, Lcom/google/android/gms/location/internal/a$1;->b:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/location/internal/l;->a(JLandroid/app/PendingIntent;)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/location/internal/a$1;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
