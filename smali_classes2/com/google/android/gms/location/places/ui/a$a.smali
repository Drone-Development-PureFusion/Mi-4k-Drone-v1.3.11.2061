.class public Lcom/google/android/gms/location/places/ui/a$a;
.super Lcom/google/android/gms/location/places/ui/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/location/places/ui/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const-string v0, "com.google.android.gms.location.places.ui.AUTOCOMPLETE"

    invoke-direct {p0, v0}, Lcom/google/android/gms/location/places/ui/d$a;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/a$a;->a:Landroid/content/Intent;

    const-string v1, "gmscore_client_jar_version"

    sget v2, Lcom/google/android/gms/common/b;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/a$a;->a:Landroid/content/Intent;

    const-string v1, "mode"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/a$a;->a:Landroid/content/Intent;

    const-string v1, "origin"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)Landroid/content/Intent;
    .locals 1

    invoke-super {p0, p1}, Lcom/google/android/gms/location/places/ui/d$a;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public a(I)Lcom/google/android/gms/location/places/ui/a$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/a$a;->a:Landroid/content/Intent;

    const-string v1, "origin"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/location/places/AutocompleteFilter;)Lcom/google/android/gms/location/places/ui/a$a;
    .locals 2
    .param p1    # Lcom/google/android/gms/location/places/AutocompleteFilter;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/a$a;->a:Landroid/content/Intent;

    const-string v1, "filter"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/a$a;->a:Landroid/content/Intent;

    const-string v1, "filter"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/gms/location/places/ui/a$a;
    .locals 2
    .param p1    # Lcom/google/android/gms/maps/model/LatLngBounds;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/a$a;->a:Landroid/content/Intent;

    const-string v1, "bounds"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/a$a;->a:Landroid/content/Intent;

    const-string v1, "bounds"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/location/places/ui/a$a;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/a$a;->a:Landroid/content/Intent;

    const-string v1, "initial_query"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/location/places/ui/a$a;->a:Landroid/content/Intent;

    const-string v1, "initial_query"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_0
.end method
